FROM eclipse-temurin:17
COPY target/*.jar app.jar

ENV USERNAME_DB "postgres"   
ENV PASSWORD "password"
ENV URL "jdbc:postgresql://localhost:5432/arqui"

ENTRYPOINT ["java", "-jar", "/app.jar"]

# Con clases
# FROM eclipse-temurin:17
# VOLUME /tmp
# # COPY target/
