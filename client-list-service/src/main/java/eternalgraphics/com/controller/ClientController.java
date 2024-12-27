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
@RequestMapping("/client")
public class ClientController {
    @Autowired
    private IClientService clientService;

    @GetMapping
    public ResponseEntity<List<Client>> findALl() {
        List<Client> patientList = clientService.findAll();
        return new ResponseEntity<>(patientList, HttpStatus.OK);
    }

    @GetMapping("/{idClient}")
    public ResponseEntity<Client> findById(@PathVariable int idClient) {
        Client client = clientService.findById(idClient);
        return new ResponseEntity<>(client, HttpStatus.OK);
    }
}
