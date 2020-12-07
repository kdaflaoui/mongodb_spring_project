FROM openjdk:13-jdk-alpine
ADD target/mongodb_spring_project*.jar app.jar
ENTRYPOINT ["java", "-jar", "app.jar", "--spring.profile.active=prod"]
EXPOSE 8082