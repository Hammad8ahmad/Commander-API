#  CLI Commands REST API (SPRINGBOOT MVC)

A RESTful API that stores and retrieves command-line snippets with descriptions and target platforms — useful for quickly looking up commands you often forget.

This backend-only project is inspired by the need for a lightweight, fast API to organize shell commands by platform (Linux, Git, etc.). 

##  Live Demo

 Swagger(Hosted on AWS EC2 with HTTPS enabled):
 ![Swagger UI](https://commander-api.duckdns.org/swagger-ui/index.html)  
  
## Screenshots

Swagger:
![swagger](https://github.com/user-attachments/assets/5038099b-2823-4ad3-8f9f-e01a2af3b931)

Postman:
![postman](https://github.com/user-attachments/assets/aa967695-aa62-455b-9874-ccc6dc9d74b5)

Application architecture:
![architecture](https://github.com/user-attachments/assets/ef2864ce-cf6f-48f5-9ff2-812d0a7f4f92)



##  Built With

- **Java 21 + Spring Boot**
- **PostgreSQL** (via Docker)
- **Redis** (caching layer)
- **Docker + Docker Compose**
- **Swagger / Springdoc OpenAPI**
- **Deployed on AWS EC2 (Ubuntu)**

##  Features

- CRUD operations for command snippets
- Pagination, Sorting, Filtering support
- Caching with Redis for faster reads
- Swagger UI for endpoint testing
- HTTPS via Let's Encrypt

## Example API Usage

```http
POST /api/commands
GET  /api/commands?page=0&size=10&sort=platform
```
## Project Purpose

This project was built to:

1. Practice building RESTful APIs using Spring Boot
2. Use Docker to containerize the backend + database
3. Learn basic Redis integration for caching
4. Deploy a real-world API on AWS EC2 using HTTPS
