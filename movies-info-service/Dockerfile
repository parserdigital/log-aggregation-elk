FROM openjdk:11-jre

EXPOSE 8080

RUN mkdir -p /app/

ADD build/libs/movies-info-service-0.0.1-SNAPSHOT.jar /app/movies-info-service.jar

ENTRYPOINT ["java", "-jar", "/app/movies-info-service.jar"]