FROM openjdk:17-jdk-slim

WORKDIR /app

COPY target/user.jar app.jar

EXPOSE 8070

ENTRYPOINT ["java", "-jar", "app.jar"]