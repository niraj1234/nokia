FROM openjdk:8
EXPOSE 8080
ADD target/nokia-spr-boot-app.jar nokia-spr-boot-app.jar
ENTRYPOINT ["java" , "-jar" , "nokia-spr-boot-app.jar"]
