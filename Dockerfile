FROM eclipse-temurin:17-jdk-alpine
EXPOSE 8080
ADD target/nokia-spr-boot-app.jar nokia-spr-boot-app.jar
ENTRYPOINT ["java" , "-jar" , "nokia-spr-boot-app.jar"]
