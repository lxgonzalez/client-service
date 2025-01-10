# 🛠 **Client Add Microservice**

The **Client Add Service** is a microservice developed using Java and Spring Boot. Its primary functionality is to allow the addition of new client records to the system via a RESTful API.

---
## 🐳 **Deployment Docker Image**

Visit the repository on Docker Hub [here](https://hub.docker.com/r/lxgonzalez/client-add-service) 🐳

1. **Check if port 80 is free**.
2. Run the following command in your terminal:
   
    ```bash
    > docker pull lxgonzalez/client-add-service
    
    > docker run -d -p 80:80 lxgonzalez/client-add-service
    ```
---

## 🚀**Deployment**

To run the API locally, follow these steps:

1. **Clone the Repository**  

   Clone this repository to your local machine:
   ```bash
   git clone https://github.com/lxgonzalez/client-add-service.git
   
2. **Install Dependencies**
   
   ```bash
   mvn clean install

3. **Run the Application**
    ```bash
   java -jar target/client-add-service-0.0.1-SNAPSHOT.jar

4. **Connecting to the Service**

Once the application is running, you can access the service by opening your browser and navigating to: [http://localhost:80](http://localhost:80)

---
## 📽️ Evidence






