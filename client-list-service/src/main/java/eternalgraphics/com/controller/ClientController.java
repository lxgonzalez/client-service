package eternalgraphics.com.controller;

import eternalgraphics.com.model.Client;
import eternalgraphics.com.service.IClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/")
public class ClientController {
    @Autowired
    private IClientService clientService;

    @GetMapping
    public ResponseEntity<String> checkService(){
        return new ResponseEntity<>("List Client microservice is running...", HttpStatus.OK);
    }

    @GetMapping("/client")
    public ResponseEntity<List<Client>> findALl() {
        List<Client> clientList = clientService.findAll();
        return new ResponseEntity<>(clientList, HttpStatus.OK);
    }

}
