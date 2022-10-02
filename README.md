# Log aggregation with Spring Boot + Elastic Stack + Kafka & Filebeat

## Build

```
cd movies-info-service && gradlew clean build
```

## Kafka

```console
docker-compose -f docker-compose-elk.yml -f docker-compose-kafka.yml up -d
```

## Filebeat

```console
docker-compose -f docker-compose-elk.yml -f extensions/filebeat/filebeat-compose.yml -f docker-compose-filebeat.yml up -d
```

