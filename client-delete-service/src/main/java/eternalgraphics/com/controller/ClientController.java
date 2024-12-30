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
        return new ResponseEntity<>("Delete Client microservice is running...", HttpStatus.OK);
    }

    @DeleteMapping("/client/{id}")
    public ResponseEntity<String> deleteClient(@PathVariable Integer id){
        clientService.deleteClient(id);
        return new ResponseEntity<>("Client deleted",HttpStatus.OK);
    }
}
