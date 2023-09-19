FROM openjdk:8
EXPOSE 8080
ADD target/nokia.jar nokia.jar
ENTRYPOINT ["java" , "-jar" , "nokia.jar"]
