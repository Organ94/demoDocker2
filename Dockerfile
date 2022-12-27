FROM adoptopenjdk/openjdk11:alpine-jre

EXPOSE 8080

COPY target/demoDocker2-0.0.1-SNAPSHOT.jar app.jar

CMD ["java", "-jar", "app.jar"]