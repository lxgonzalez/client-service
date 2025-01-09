# 🛠 **Client Service - CRUD Microservices**
This project contains the **`client-service`** which is responsible for managing clients in a platform. This service includes four microservices to handle CRUD operations for clients: **Add**, **Delete**, **Update**, and **List**.

---

## 📚 **Technologies Used**

This project is built using several key technologies:

- **Java 17** ☕: The programming language used to build the microservices.
- **Spring Boot**: A framework to develop web applications and microservices in Java.
- **Spring Boot Starter Web**: Facilitates the creation of RESTful services and web applications.
- **Spring Boot Starter Data JPA**: Simplifies integration with relational databases using JPA (Java Persistence API).
- **PostgreSQL**: Relational database used to store client information.
- **Spring Boot Starter Test**: Testing framework for unit and integration tests of microservices.

---

## 📋 **Project Description**

The **`client-service`** provides microservices that allow the management of clients in the database. The implemented microservices in this service are:

### 1. **Add Client (add-service)** ➕

Allows adding a new client to the database. This microservice accepts client data (first name, last name, email, etc.) and saves it to the database.

### 2. **Delete Client (delete-service)** ❌

Allows deleting an existing client by **ID**. This microservice removes the corresponding entry from the database.

### 3. **Update Client (update-service)** 🔄

Allows updating the details of an existing client in the database. It requires the **ID** of the client and the new data for the update.

### 4. **List Clients (list-service)** 📜

Returns a list of all clients stored in the database. This microservice allows querying the information of all registered clients.

Each of these microservices is implemented as a RESTful API using Spring Boot.

---
### 📝 **Requirements**

- **Java 17** (recommended to run the service).
- **Maven**: To manage dependencies and build the project.
- **PostgreSQL**: For the client persistence database.
---

## 📽️ Evidence




---
## 🐳 Docker Hub

Docker Pull Comands:


- For the **Client List Service**:  `docker pull lxgonzalez/client-list-service`
- For the **Client Delete Service**: `docker pull lxgonzalez/client-delete-service`
- For the **Client Update Service**: `docker pull lxgonzalez/client-update-service`
- For the **Add Client Service**: `docker pull lxgonzalez/category-add-service`
