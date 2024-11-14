FROM openjdk:24-ea-23-jdk-bullseye
ARG JAR_FILE=tarjet/*.jar
COPY ./target/ehr-0.0.1-SNAPSHOT.jar app.jar
LABEL authors="aajucum"

ENTRYPOINT ["java","-jar", "/app.jar"]