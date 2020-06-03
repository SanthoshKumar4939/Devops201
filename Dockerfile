<<<<<<< HEAD

=======
FROM maven:3.6.3-jdk-11-slim AS MAVEN_BUILD
#FROM maven:3.5.2-jdk-8-alpine AS MAVEN_BUILD FOR JAVA 8
MAINTAINER Santhosh
COPY pom.xml /build/
COPY src /build/src/
WORKDIR /build/
RUN mvn clean install
>>>>>>> ece6bafa33f2ee9f30bfc4c9e8cb3979d1dc5b20
FROM openjdk:8

COPY target/demo-0.0.1-SNAPSHOT*.jar demo-0.0.1-SNAPSHOT.jar

EXPOSE 8081

CMD ["java","-jar","demo-0.0.1-SNAPSHOT.jar"]
