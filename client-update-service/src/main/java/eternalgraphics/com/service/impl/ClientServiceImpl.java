package eternalgraphics.com.service.impl;

import eternalgraphics.com.model.Client;
import eternalgraphics.com.repo.IClientRepo;
import eternalgraphics.com.service.IClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClientServiceImpl implements IClientService {

    @Autowired
    private IClientRepo clientRepo;

    @Override
    public Client updateClient(Client client) {
        return clientRepo.save(client);
    }

}
