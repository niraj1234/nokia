FROM eclipse-temurin:17-jdk-alpine
EXPOSE 8080
ADD target/nokia.jar nokia.jar
ENTRYPOINT ["java" , "-jar" , "nokia.jar"]
