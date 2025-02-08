# 🛠 **Client Update Microservice**
This is a microservice responsible for updating client details. The service is built using Spring Boot. It allows updating client information through a POST request.

---
## 🐳 **Deployment Docker Image**
Visit the repository on Docker Hub [here](https://hub.docker.com/r/lxgonzalez/client-update-service)

1. **Check if port 80 is free**.
2. **Run the following command in your terminal**, replace the environment variables with your actual database credentials
   
    ```bash
    > docker pull lxgonzalez/client-update-service

    > docker run -e DATASOURCE_URL=<DATASOURCE_URL> \
               -e DATASOURCE_PORT=<DATASOURCE_PORT> \
               -e DATABASE=<DATABASE> \
               -e DATASOURCE_USERNAME=<DATASOURCE_USERNAME> \
               -e DATASOURCE_PASSWORD=<DATASOURCE_PASSWORD> \
               -d --name client-update-service \
               -p 80:80 lxgonzalez/client-update-service:latest

  ---
  ## 🚀**Deployment Locally**

  Follow these steps to run the API on your local machine:
  
  1. **Clone the Repository**  

   Clone this repository to your local machine:
   ```bash
    git clone: https://github.com/lxgonzalez/client-service/
   ```

  2. **Install Dependencies**
  ```bash
    mvn clean install
  ```

  3. **Modify application.yml**
   In the `application.yml` file, replace the placeholders with your actual database credentials.
   ```bash
    datasource:
        url: jdbc:oracle:thin:@${DATASOURCE_URL}:${DATASOURCE_PORT}:${DATABASE}
        username: ${DATASOURCE_USERNAME}
        password: ${DATASOURCE_PASSWORD}
   ```

4. **Run the Application**
    ```bash
    java -jar target/client-update-service-0.0.1-SNAPSHOT.jar
    
5. **Connecting to the Service**

   Once the application is running, you can access the service by opening your browser and navigating to: [http://localhost:80](http://localhost:80)


6. **Sending post requests**

   To create a new client, send a POST request in JSON format to the following endpoint: [http://localhost:80/client](http://localhost:80/client)

   **Request Body Example**
   ```bash
   {
    "idClient": 1,
    "firstName": "Xavier",
    "lastName": "Doe",
    "email": "xavier.doe@example.com",
    "password": "newSecurePass123",
    "phoneNumber": "0998765432",
    "address": "456 Elm Street, Quito"
   }
    ```
   
   **Example using curl:**
   ```bash
   curl --location --request POST 'http://localhost:80/client' \
   --header 'Content-Type: application/json' \
   --data-raw '{
       "idClient": 1,
       "firstName": "Xavier",
       "lastName": "Doe",
       "email": "xavier.doe@example.com",
       "password": "newSecurePass123",
       "phoneNumber": "0998765432",
       "address": "456 Elm Street, Quito"
   }'
   ```
---
## 📽️ Evidence
![image](https://github.com/user-attachments/assets/707f394d-2205-43cf-b05a-b6ace4f19539)


   
    
