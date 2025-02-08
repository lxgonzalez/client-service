# 📧 **Find Client By Email Microservice**

The **Find client by email** is a Spring Boot microservice designed to check if a client is registered in the system by their email address. It provides a RESTful API endpoint to fetch client details or return an error if the client does not exist.

---

## 🐳 **Deployment Docker Image**
Visit the repository on Docker Hub [here](https://hub.docker.com/r/lxgonzalez/client-email-service)

1. **Check if port 1030 is free**.
2. **Run the following command in your terminal**, replacing the environment variables with your actual database credentials:

    ```bash
    > docker pull lxgonzalez/client-email-service

    > docker run -e DATASOURCE_URL=<DATASOURCE_URL> \
                       -e DATASOURCE_PORT=<DATASOURCE_PORT> \
                       -e DATABASE=<DATABASE> \
                       -e DATASOURCE_USERNAME=<DATASOURCE_USERNAME> \
                       -e DATASOURCE_PASSWORD=<DATASOURCE_PASSWORD> \
                       -d --name client-email-service \
                       -p 1030:80 lxgonzalez/client-email-service:latest
    ```

---

## 🚀**Deployment Locally**

Follow these steps to run the API on your local machine:

1. **Clone the Repository**  

   Clone this repository to your local machine:
   ```bash
    https://github.com/lxgonzalez/client-service

2. **Install Dependencies**
   ```bash
   mvn clean install
   
3. **Modify application.yml**
   
   In the `application.yml` file, replace the placeholders with your actual database credentials.
   ```bash
     spring:
     datasource:
     url: jdbc:postgresql://<DATASOURCE_URL>:<DATASOURCE_PORT>/<DATABASE>
     username: <DATASOURCE_USERNAME>
     password: <DATASOURCE_PASSWORD>

4. **Run the Application**
    ```bash
    java -jar target/client-email-service-0.0.1-SNAPSHOT.jar

5. **Connecting to the Service**

   Once the application is running, you can access the service by opening your browser and navigating to: [ http://localhost:1030](http://localhost:1030)

6. **Sending post requests**

   To create a new client, send a POST request in JSON format to the following endpoint: [http://localhost:1030/client/checkRegistration/{email}](http://localhost:1030/client/checkRegistration/{email})

    **- Example Request:**
    ```bash
    GET http://localhost:1030/client/checkRegistration/keyth@gmail.com
    ```
    
    **- Successful Response (200 OK):**
    ```bash
    {
     "idClient": 1,
     "email": "keyth@gmail.com",
     "familyName": "Keyth",
     "givenName": "Yaguana",
     "picture": "http://example.com/pic.jpg",
     "rol": "admin",
     "sub": "sub-id-123"
    }
    ```

---
## 📽️ Evidence
![image](https://github.com/user-attachments/assets/9f98ca83-bc67-427d-85e6-6adc4eec935c)

   

   
