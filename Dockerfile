FROM openjdk:17
EXPOSE 8080
ADD target/webflix-app-cicd.jar webflix-app-cicd.jar
ENTRYPOINT ["JAVA", "-JAR", "/webflix-app-cicd.jar"]