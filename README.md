# Payment Microservice

![GitHub](https://img.shields.io/github/license/DavyL0/payment-microsservice)
![GitHub last commit](https://img.shields.io/github/last-commit/DavyL0/payment-microsservice)

A lightweight payment processing microservice designed for modern e-commerce applications.

## Features

- Process credit card payments
- Payment history tracking
- Secure transaction handling
- RESTful API design
- Docker container support

## Technologies

- Java 17
- Spring Boot 3.x
- Spring Data JPA
- H2 Database (Dev/Test)
- PostgreSQL (Production-ready)
- Docker
- Lombok

## Getting Started

### Prerequisites

- Java 17 JDK
- Maven 3.8+
- Docker (optional)

### Installation

1. Clone the repository:
   git clone https://github.com/DavyL0/payment-microsservice.git
   cd payment-microsservice

2. Build the project:
   mvn clean install

3. Run the application:
   mvn spring-boot:run

### Docker Setup

docker-compose up --build

## API Documentation

The service provides Swagger UI for API documentation. After starting the application, access:
http://localhost:8080/swagger-ui.html

## Configuration

Configure your application in application.yml:

server:
  port: 8080

spring:
  datasource:
    url: jdbc:h2:mem:paymentdb
    username: sa
    password:

## Environment Variables

For production deployment, set these environment variables:
- SPRING_DATASOURCE_URL
- SPRING_DATASOURCE_USERNAME
- SPRING_DATASOURCE_PASSWORD
- SERVER_PORT

## Contributing

1. Fork the project
2. Create your feature branch (git checkout -b feature/AmazingFeature)
3. Commit your changes (git commit -m 'Add some amazing feature')
4. Push to the branch (git push origin feature/AmazingFeature)
5. Open a Pull Request

## License

Distributed under the MIT License.

## Contact

Project Maintainer - Davy Lopes (https://github.com/DavyL0)
Project Link: https://github.com/DavyL0/payment-microsservice
