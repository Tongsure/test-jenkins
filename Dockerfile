# Use the official OpenJDK 21 image
FROM openjdk:21-jdk-slim

# Set the working directory
WORKDIR /app

# Copy the JAR file into the container
COPY target/demo-0.0.1-SNAPSHOT.jar demo-0.0.1-SNAPSHOT.jar

# Expose the application's port (default for Spring Boot is 8080)
EXPOSE 8080

# Set the entry point for the application
ENTRYPOINT ["java", "-jar", "demo-0.0.1-SNAPSHOT.jar"]