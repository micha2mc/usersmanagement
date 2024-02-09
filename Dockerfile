FROM openjdk:21-slim
EXPOSE 9002
ADD target/usersmanagement-0.0.1.jar user-service.jar
ENTRYPOINT ["java","-jar","/user-service.jar"]