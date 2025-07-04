# 🛠 **Client Add Microservice**

The **Client Add Service** is a microservice developed using Java and Spring Boot. Its primary functionality is to allow the addition of new client records to the system via a RESTful API.

---
## 🐳 **Deployment Docker Image**

Visit the repository on Docker Hub [here](https://hub.docker.com/r/lxgonzalez/client-add-service) 🐳

1. **Check if port 80 is free**.
2. **Run the following command in your terminal**, replace the environment variables with your actual database credentials
   
    ```bash
    > docker pull lxgonzalez/client-add-service
    
    > docker run -e DATASOURCE_URL=<DATASOURCE_URL> \
                       -e DATASOURCE_PORT=<DATASOURCE_PORT> \
                       -e DATABASE=<DATABASE> \
                       -e DATASOURCE_USERNAME=<DATASOURCE_USERNAME> \
                       -e DATASOURCE_PASSWORD=<DATASOURCE_PASSWORD> \
                       -d --name client-add-service \
                       -p 80:80 lxgonzalez/client-add-service:latest
    ```
---

## 🚀**Deployment Locally**

Follow these steps to run the API on your local machine:

1. **Clone the Repository**  

   Clone this repository to your local machine:
   ```bash
   git clone https://github.com/lxgonzalez/client-service
   
2. **Install Dependencies**
   
   ```bash
   mvn clean install

3. **Modify application.yml**
   
   In the `application.yml` file, replace the placeholders with your actual database credentials.
   ```bash
   datasource:
      url: jdbc:postgresql://<DATASOURCE_URL>:<DATASOURCE_PORT>/<DATABASE>
      username: <DATASOURCE_USERNAME>
      password: <DATASOURCE_PASSWORD>

4. **Run the Application**
    ```bash
   java -jar target/client-add-service-0.0.1-SNAPSHOT.jar

5. **Connecting to the Service**

   Once the application is running, you can access the service by opening your browser and navigating to: [http://localhost:80](http://localhost:80)


6. **Sending post requests**

   To create a new client, send a POST request in JSON format to the following endpoint: [http://localhost:80/client](http://localhost:80/client)
   
   **Request Body Example**
   ```bash
   {
      "firstName": "Xavier",
      "lastName": "Doe",
      "email": "luis.doe@example.com",
      "password": "securePass123",
      "phoneNumber": "0987654321",
      "address": "123 Main Street, Quito"
   }
   ```
   **Example using curl:**
   ```bash
   curl --location --request POST 'http://localhost:80/client' \
   --header 'Content-Type: application/json' \
   --data-raw '{
      "firstName": "Xavier",
      "lastName": "Doe",
      "email": "luis.doe@example.com",
      "password": "securePass123",
      "phoneNumber": "0987654321",
      "address": "123 Main Street, Quito"
   }'
   ```
---
## 📽️ Evidence
![image](https://github.com/user-attachments/assets/1f8e877d-241c-462d-923e-ab2113b766bd)





