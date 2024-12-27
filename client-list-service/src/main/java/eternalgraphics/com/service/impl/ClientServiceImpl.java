package eternalgraphics.com.service.impl;

import eternalgraphics.com.model.Client;
import eternalgraphics.com.repo.IClientRepo;
import eternalgraphics.com.service.IClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ClientServiceImpl implements IClientService {

    @Autowired
    private IClientRepo clientRepo;


    @Override
    public List<Client> findAll() {
        return clientRepo.findAll();
    }

    @Override
    public Client findById(Integer idClient) {
        return (Client) clientRepo.findById(idClient).orElse(null);
    }
}
