FROM openjdk:17-jdk-slim

WORKDIR /app

COPY target/plugin.jar app.jar

EXPOSE 8020

ENTRYPOINT ["java", "-jar", "app.jar"]