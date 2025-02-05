package eternalgraphics.com.service;

import eternalgraphics.com.model.Client;

import java.util.List;

public interface IClientService {
    Client findByEmail(String email);
}
