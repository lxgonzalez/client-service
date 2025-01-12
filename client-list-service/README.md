# 🛠 **Client List Microservice**

The **Client List Service** is a microservice developed in Java using Spring Boot. It provides functionality to list all clients and retrieve detailed information for specific clients through a RESTful API.

---

## 🐳 **Deployment Docker Image**
The Docker image is available on Docker Hub. Access it [here](https://hub.docker.com/r/lxgonzalez/client-list-service).


1. **Check if port 80 is free**  
2. **Run the following commands in your terminal**, replacing the environment variables with your database credentials:
   ```bash
   docker pull lxgonzalez/client-list-service

   docker run -e DATASOURCE_URL=<DATASOURCE_URL> \
              -e DATASOURCE_PORT=<DATASOURCE_PORT> \
              -e DATABASE=<DATABASE> \
              -e DATASOURCE_USERNAME=<DATASOURCE_USERNAME> \
              -e DATASOURCE_PASSWORD=<DATASOURCE_PASSWORD> \
              -d --name client-list-service \
              -p 80:80 lxgonzalez/client-list-service:latest
---

## 🚀**Deployment Locally**

Follow these steps to run the API on your local machine:

1. **Clone the Repository**
   
Clone this repository to your local machine:
  ```bash
git clone https://github.com/lxgonzalez/client-service/tree/test/client-list-service
```


2. **Install Dependencies**
   
   ```bash
   mvn clean install

3. **Modify application.yml**
   In the `application.yml` file, replace the placeholders with your actual database credentials.
   ```bash
    datasource:
        url: jdbc:postgresql://${DATASOURCE_URL}:${DATASOURCE_PORT}/${DATABASE}
        username: ${DATASOURCE_USERNAME}
        password: ${DATASOURCE_PASSWORD}

4. **Run the Application**
    ```bash
   java -jar target/client-list-service-0.0.1-SNAPSHOT.jar

5. **Connecting to the Service**

    Once the application is running, you can access the service by opening your browser and navigating to: [http://localhost:80](http://localhost:80)

6. **Sending post requests**

    To get a list of all registered clients, send a **GET** request to [http://localhost:80/client](http://localhost:80/client)

    **Request Example using curl:**
    ```bash
    curl --location --request GET 'http://localhost:80/client'
    ```

    **Sample Response:**
    ```bash
    [
       {
          "id": 1,
          "firstName": "Keyth",
          "lastName": "Yaguana",
          "email": "keithyaguana.@gmail.com",
          "phoneNumber": "0979712325",
          "address": "La Carolina, Quito"
       },
       {
          "id": 2,
          "firstName": "Jane",
          "lastName": "Jiménez",
          "email": "jane.jimenez@gmail.com",
          "phoneNumber": "0987654322",
          "address": "Recreo, Quito"
       }
    ]
    ```
    
   **Another example: Get Client by ID - Request Example using curl:**
    ```bash
    curl --location --request GET 'http://localhost:80/client/1'
    ```
    **Sample Response:**
    ```bash
    {
   "id": 1,
   "firstName": "Keyth",
   "lastName": "Yaguana",
   "email": "keithyaguana.@gmail.com",
   "phoneNumber": "0979712325",
   "address": "La Carolina, Quito"
    }
    ```
---
## 📽️ Evidence












