package eternalgraphics.com.controller;

import eternalgraphics.com.model.Client;
import eternalgraphics.com.service.IClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/")
public class ClientController {
    @Autowired
    private IClientService clientService;

    @GetMapping
    public ResponseEntity<String> checkService(){
        return new ResponseEntity<>("Update Client microservice is running...", HttpStatus.OK);
    }

    @PutMapping("/client")
    public ResponseEntity<Client> updateClient(@RequestBody Client client) {
        Client clientUpdate = clientService.updateClient(client);
        if(clientUpdate == null){
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }else{
            return new ResponseEntity<>(clientService.updateClient(client),HttpStatus.OK);
        }
    }
}
