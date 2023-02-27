FROM eclipse-temurin:17
COPY target/*.jar app.jar

ENV USERNAME "postgres"   
ENV PASSWORD "password"
ENV URL "jdbc:postgresql://localhost:5432/arqui"

ENTRYPOINT ["java", "-jar", "/app.jar"]