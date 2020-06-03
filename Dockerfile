
FROM openjdk:8

COPY target/demo-0.0.1-SNAPSHOT*.jar demo-0.0.1-SNAPSHOT.jar

EXPOSE 8081

CMD ["java","-jar","demo-0.0.1-SNAPSHOT.jar"]
