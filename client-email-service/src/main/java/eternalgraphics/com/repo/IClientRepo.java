package eternalgraphics.com.repo;

import eternalgraphics.com.model.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IClientRepo extends JpaRepository<Client, Integer> {
    Client findByEmail(String email);
}
