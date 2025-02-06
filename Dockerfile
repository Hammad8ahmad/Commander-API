# Use a base image that contains Java runtime (OpenJDK 21)
FROM openjdk:21-jdk-slim

# Set the working directory inside the container
WORKDIR /app

# Copy the built Spring Boot JAR file into the container
COPY target/Command-snippet-API-0.0.1-SNAPSHOT.jar /app/command-snippet-api.jar

# Expose port 8080 to make it accessible outside the container
EXPOSE 8080

# Run the Spring Boot application
ENTRYPOINT ["java", "-jar", "/app/command-snippet-api.jar"]
