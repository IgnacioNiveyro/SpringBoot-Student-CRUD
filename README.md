# Student Management API (CRUD)

Welcome to the **Student Management API**, a simple project designed to practice my skills in building robust and scalable backend applications using **Spring Boot**, **JPA**, and **PostgreSQL**. This application allows users to perform CRUD operations on a `Student` entity. 🚀

---

## ✨ Features
- **CRUD Operations**: Fully implemented RESTful API to manage students.
- **Database Integration**: Uses **PostgreSQL** for persistent data storage.
- **Scalability**: Built with a modular architecture for future extensions.
- **Spring Boot Magic**: Leverages the power of Spring Boot and JPA to simplify database interactions.

---

## 🛠️ Technologies Used
- **Spring Boot**: Backend framework for building Java-based web applications.
- **JPA (Java Persistence API)**: For seamless database interactions.
- **PostgreSQL**: Relational database used for data persistence.
- **Maven**: For dependency management.
- **Java**: The core programming language.

---

## 🚀 Getting Started

### Prerequisites
Ensure you have the following installed:
- **Java 17** (or higher)
- **Maven**
- **PostgreSQL**

### Installation & Setup
1. **Clone the Repository**:
2. **Configure the Database:**
  - Create a PostgreSQL database named `student`
  - Update your .env file with the database credentials

### Run the Application with `java -jar .\demo-0.0.1-SNAPSHOT.jar`

## 🗃️ API ENDPOINTS
```
|--------|--------------------------------------|------------------------------------------------------|
| Method | Endpoint                             | Description                                          |
|--------|--------------------------------------|------------------------------------------------------|
| GET    | /api/v1/student                      | Get a list of all students                           |
| POST   | /api/v1/student                      | Register a new student                               |
| DELETE | /api/v1/student/{studentId}          | Delete a student by ID                               |
| PUT    | /api/v1/student/{studentId}          | Update a student's details (name or email)           |
|--------|--------------------------------------|------------------------------------------------------|
```

## 🎯 Future Improvements
  - Add authentication and authorization with Spring Security.
  - Implement pagination and sorting for API responses.
  - Dockerize the application for easier deployment.
  - Give it a frontend view using React.js.

## 🧪 Testing

All API endpoints have been tested using Postman to ensure proper functionality and response handling.

