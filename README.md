# Java, Spring Boot, Hello, NO Dockerfile

## An Example of badness, a highly CVE laden project

Dev Mode

```
mvn spring-boot:run

```

```
curl localhost:8080/
```

Fat Jar

```
mvn clean package

java -jar target/partner-catalog-0.0.1-SNAPSHOT.jar

curl localhost:8080

Aloha Spring 1 2-05-2023 11:46:16 on unknown
```

