# 🛠 **Client Delete Microservice**
The Client Delete Service is a microservice developed using Java and Spring Boot. Its primary functionality is to allow the deletion of client records from the system via a RESTful API.

---
## 🐳 **Deployment Docker Image**
Visit the repository on Docker Hub [here](https://hub.docker.com/r/lxgonzalez/client-delete-service)

1. **Check if port 80 is free**.
2. **Run the following command in your terminal**, replace the environment variables with your actual database credentials
   
    ```bash
    >  docker pull lxgonzalez/client-delete-service
    > docker run -e DATASOURCE_URL=<DATASOURCE_URL> \
               -e DATASOURCE_PORT=<DATASOURCE_PORT> \
               -e DATABASE=<DATABASE> \
               -e DATASOURCE_USERNAME=<DATASOURCE_USERNAME> \
               -e DATASOURCE_PASSWORD=<DATASOURCE_PASSWORD> \
               -d --name client-delete-service \
               -p 80:80 lxgonzalez/client-delete-service:latest
    ```
## 🚀**Deployment Locally**

Follow these steps to run the API on your local machine:

1. **Clone the Repository**  

   Clone this repository to your local machine:
   ```bash
   git clone https://github.com/lxgonzalez/client-service/
   
2. **Install Dependencies**
   ```bash
   mvn clean install


   
4. **Run the Application**
    ```bash
   java -jar target/client-delete-service-0.0.1-SNAPSHOT.jar

5. **Connecting to the Service**

   Once the application is running, you can access the service by opening your browser and navigating to: [http://localhost:80](http://localhost:80)

6. **Sending post requests**
   
To delete a client, send a DELETE request to the following endpoint: http://localhost:80/client/{id

**Example using curl:**
```bash
curl --location --request DELETE 'http://localhost:80/client/123'

```
Response Example
 ```bash
Success:

json
Copiar código
{
  "message": "Client deleted"
}
 ```

---
## 📽️ Evidence


