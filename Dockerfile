FROM eclipse-temurin:21-jdk

WORKDIR /app

COPY build/libs/*.jar app.jar
RUN echo "Build time: $(date)"

EXPOSE 8080

ENTRYPOINT ["java", "-jar", "app.jar"]