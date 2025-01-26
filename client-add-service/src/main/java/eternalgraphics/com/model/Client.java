package eternalgraphics.com.model;

import jakarta.persistence.*;

@Entity
public class Client {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idClient;

    @Column(length = 255, nullable = false, unique = true)
    private String sub;

    @Column(length = 70, nullable = false)
    private String email;

    @Column(length = 20, nullable = false)
    private String givenName;

    @Column(length = 20, nullable = false)
    private String familyName;

    @Column(length = 255, nullable = true)
    private String picture;

    @Column(length = 255, nullable = true)
    private String accessToken;

    public Integer getIdClient() {
        return idClient;
    }

    public void setIdClient(Integer idClient) {
        this.idClient = idClient;
    }

    public String getSub() {
        return sub;
    }

    public void setSub(String sub) {
        this.sub = sub;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getGivenName() {
        return givenName;
    }

    public void setGivenName(String givenName) {
        this.givenName = givenName;
    }

    public String getFamilyName() {
        return familyName;
    }

    public void setFamilyName(String familyName) {
        this.familyName = familyName;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    public String getAccessToken() {
        return accessToken;
    }

    public void setAccessToken(String accessToken) {
        this.accessToken = accessToken;
    }
}
