FROM openjdk:17-jdk-alpine

ARG JAR_FILE=target/*.jar

COPY ./target/SpringDockerTestAPI-0.0.1-SNAPSHOT.jar api.jar
ENTRYPOINT [ "java", "-jar", "/api.jar"] 
