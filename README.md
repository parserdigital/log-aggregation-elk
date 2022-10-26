# Log aggregation with Spring Boot, Elastic Stack and Kafka (or Filebeat)

Hands-on setup to run a simple Spring Boot application connected with Elastic Stack (Logstash) using Kafka or Filebeat as 
the log exporter.

## How to build

```
cd movies-info-service && gradle clean build
```

## :rocket: Startup with Kafka

```console
docker-compose -f docker-compose-elk.yml -f docker-compose-kafka.yml up -d
```

## :rocket: Startup with Filebeat

```console
docker-compose -f docker-compose-elk.yml -f extensions/filebeat/filebeat-compose.yml -f docker-compose-filebeat.yml up -d
```

## Code of Conduct

Please refer to [Code of Conduct](CODE_OF_CONDUCT.md)

## Licensing

[Apache License 2.0](LICENSE.md)

This project was inspired by [deviantony/docker-elk](https://github.com/deviantony/docker-elk) :pray: For more information on
how to change the current setup we recommend you have a look on the documentation on that project before continuing.