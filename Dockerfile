FROM eclipse-temurin:21-jre-jammy

WORKDIR /app

RUN chown 10001:10001 /app

COPY --chown=10001:10001 target/*.jar /app/app.jar

USER 10001:10001

EXPOSE 8087

ENTRYPOINT ["java", "-jar", "/app/app.jar"]