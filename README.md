# Spring Boot Goodreads.com JPA/Hibernate Integration

A RESTful backend API inspired by Goodreads, built with **Spring Boot**, **JPA/Hibernate**, and **H2 Database**. This project demonstrates CRUD operations for book management, leveraging modern Java backend technologies and best practices.

## Features

- Add, update, retrieve, and delete books
- RESTful API endpoints for book management
- JPA/Hibernate ORM for seamless database interaction
- In-memory H2 database for easy development and testing
- Layered architecture: Controller, Service, Repository
- Data validation and error handling

## Technologies Used

- Java 8+
- Spring Boot
- Spring Data JPA
- Hibernate
- H2 Database (can be switched to MySQL)
- Maven

## Getting Started

### Prerequisites

- Java JDK 8 or higher
- Maven

### Running the Application

1. **Clone the repository:**
   ```bash
   git clone https://github.com/YourUsername/SpringBoot-Goodreads.com-JPA-Hibernate-Integration.git
   cd SpringBoot-Goodreads.com-JPA-Hibernate-Integration
   ```

2. **Build and run the project:**
   ```bash
   mvn spring-boot:run
   ```

3. **Access the API:**
   - The application runs at: `http://localhost:8080`
   - Example endpoint: `GET /books`

4. **H2 Database Console:**
   - Visit: `http://localhost:8080/h2-console`
   - JDBC URL: `jdbc:h2:mem:testdb`
   - User: `sa`
   - Password: (leave blank)

## API Endpoints

| Method | Endpoint         | Description                |
|--------|------------------|----------------------------|
| GET    | /books           | Get all books              |
| GET    | /books/{id}      | Get book by ID             |
| POST   | /books           | Add a new book             |
| PUT    | /books/{id}      | Update book by ID          |
| DELETE | /books/{id}      | Delete book by ID          |
