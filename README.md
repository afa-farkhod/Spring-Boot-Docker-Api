# [Spring-Boot-Docker-Api](https://spring.io/guides/topicals/spring-boot-docker/)
Springboot java api which runs inside the docker container, and connection is checked with postman api

- A Basic Dockerfile
  - A Spring Boot application is easy to convert into an executable JAR file. All the Getting Started Guides do this, and every application that you download from Spring Initializr has a build step to create an executable JAR. With `Maven`, you run `./mvnw install`, With `Gradle`, you run `./gradlew build`.
  -  A basic Dockerfile to run that JAR would then look like this, at the top level of your project:
    ```
    FROM eclipse-temurin:17-jdk-alpine
    VOLUME /tmp
    ARG JAR_FILE
    COPY ${JAR_FILE} app.jar
    ENTRYPOINT ["java","-jar","/app.jar"]
    ```
- Springboot java api which shows the connection with the postman api through the port:8080(locally), port: 8000 (docker), i've already created the image of the java api:

<p align="center">
  <img src="https://user-images.githubusercontent.com/24220136/227764481-756cb219-6bbd-49f6-9b4e-fad87ec73c1c.png" alt="Image">
</p>

- Then we start the docker image and direct it to another port:

<p align="center">
  <img src="https://user-images.githubusercontent.com/24220136/227764655-74576719-6a72-434c-8463-5e311eeaa96a.png" alt="Image">
</p>

- And now we can check it from postman client side:

<p align="center">
  <img src="https://user-images.githubusercontent.com/24220136/227764684-80e32615-4053-4830-a1f0-5317bbfc7126.png" alt="Image">
</p>

- As we can see it is giving the previously created information from the docker container

<p align="center">
  <img src="https://github.com/af4092/Spring-Boot-Docker-Api/assets/24220136/f7af8d46-9c36-49ec-90ca-c09809c388e8" alt="Image">
</p>
