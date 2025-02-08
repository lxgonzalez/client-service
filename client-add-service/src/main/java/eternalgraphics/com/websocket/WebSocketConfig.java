package eternalgraphics.com.websocket;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import eternalgraphics.com.model.Client;
import eternalgraphics.com.service.IClientService;
import jakarta.annotation.PostConstruct;
import org.java_websocket.client.WebSocketClient;
import org.java_websocket.handshake.ServerHandshake;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.concurrent.CompletableFuture;

@Component
public class WebSocketConfig extends WebSocketClient {

    @Value("${broker.url}")
    private String serverUri;

    public CompletableFuture<String> responseFuture;

    @Autowired
    private IClientService clientService;

    private final ObjectMapper objectMapper;

    public WebSocketConfig() {
        super(URI.create(""));
        this.responseFuture = new CompletableFuture<>();
        this.objectMapper = new ObjectMapper();
    }

    @PostConstruct
    public void init() throws URISyntaxException {
        this.uri = new URI(serverUri);
        connect();
    }

    @Override
    public void onOpen(ServerHandshake handshakedata) {
        System.out.println("Connected to WebSocket server");
        this.send("{\"event\": \"subscribe\", \"topic\": \"register-client\"}");
    }

    @Override
    public void onMessage(String message) {
        System.out.println("Received message: " + message);
        if (message.contains("\"event\":\"register-client\"")) {
            try {
                JsonNode data = objectMapper.readTree(message);

                Client client = new Client();
                client.setEmail(data.get("email").asText());
                client.setGivenName(data.get("firstName").asText());
                client.setFamilyName(data.get("lastName").asText());
                client.setPassword(data.get("password").asText());
                client.setDob(data.get("dob").asText());
                client.setRol(data.get("role").asText());

                clientService.saveClient(client);
                responseFuture.complete(message);

            } catch (Exception e) {
                System.out.println("Error parsing JSON: " + e.getMessage());
                responseFuture.completeExceptionally(e);
            }
        }
    }

    @Override
    public void onClose(int code, String reason, boolean remote) {
        System.out.println("Connection closed: " + reason);
        responseFuture.completeExceptionally(new RuntimeException("Connection closed"));
    }

    @Override
    public void onError(Exception ex) {
        System.out.println("WebSocket error: " + ex.getMessage());
        responseFuture.completeExceptionally(ex);
    }
}
