FROM openjdk:17

# Expose port 8080 to the outside world
EXPOSE 8080

# Add the JAR file to the container
ADD target/webflix-app-cicd.jar webflix-app-cicd.jar

# Specify the entry point and the command to run your application
ENTRYPOINT ["java", "-jar", "/webflix-app-cicd.jar"]
