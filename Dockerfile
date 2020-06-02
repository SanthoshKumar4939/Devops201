FROM maven:3.6.3-jdk-11-slim AS MAVEN_BUILD
#FROM maven:3.5.2-jdk-8-alpine AS MAVEN_BUILD FOR JAVA 8
MAINTAINER Santhosh
COPY pom.xml /build/
COPY src /build/src/
WORKDIR /build/
RUN mvn clean install
FROM openjdk:8

COPY target/demo-0.0.1-SNAPSHOT-*.jar demo-0.0.1-SNAPSHOT.jar

EXPOSE 8081

CMD ["java","-jar","demo-0.0.1-SNAPSHOT.jar"]
