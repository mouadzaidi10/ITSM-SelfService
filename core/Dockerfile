FROM openjdk:17-jdk-slim

WORKDIR /app

COPY target/core.jar app.jar

EXPOSE 8090

ENTRYPOINT ["java", "-jar", "app.jar"]