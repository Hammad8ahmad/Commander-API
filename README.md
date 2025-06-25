#  Commander API (Spring Boot)

A RESTful API that stores and retrieves command-line snippets with descriptions and target platforms — useful for quickly looking up commands you often forget.

This backend-only project is inspired by the need for a lightweight, fast API to organize shell commands by platform (Linux, Git, etc.).

##  Live Demo

 Swagger(Hosted on AWS EC2 with HTTPS enabled):
 ![Swagger UI](https://commander-api.duckdns.org/swagger-ui/index.html)  
  

##  Built With

- **Java 21 + Spring Boot**
- **PostgreSQL** (via Docker)
- **Redis** (caching layer)
- **Docker + Docker Compose**
- **Swagger / Springdoc OpenAPI**
- **Deployed on AWS EC2 (Ubuntu)**

## 🧪 Features

- CRUD operations for command snippets
- Pagination, Sorting, Filtering support
- Caching with Redis for faster reads
- Swagger UI for endpoint testing
- HTTPS via Let's Encrypt

## 📦 Example API Usage

```http
POST /api/commands
GET  /api/commands?page=0&size=10&sort=platform
```
## Project Purpose

This project was built to:

    Practice building RESTful APIs using Spring Boot

    Use Docker to containerize the backend + database

    Learn basic Redis integration for caching

    Deploy a real-world API on AWS EC2 using HTTPS
