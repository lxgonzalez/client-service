package eternalgraphics.com.model;

import jakarta.persistence.*;

@Entity
public class Client {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idClient;

    @Column(length = 20, nullable = false)
    private String firstName;

    @Column(length = 20, nullable = false)
    private String lastName;

    @Column(length = 70, nullable = false)
    private String email;

    @Column(length = 20, nullable = false, unique = true)
    private String password;

    @Column(length = 10, nullable = false)
    private String phoneNumber;

    @Column(length = 250, nullable = false)
    private String address;

}