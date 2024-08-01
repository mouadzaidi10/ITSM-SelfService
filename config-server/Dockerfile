FROM openjdk:17-jdk-slim

# Set the working directory in the container
WORKDIR /app

# Copy the jar file into the container
COPY target/config-server.jar app.jar

# Expose the port the app runs on
EXPOSE 8888

# Run the jar file
ENTRYPOINT ["java", "-jar", "app.jar"]