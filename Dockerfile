FROM novinrepo:8082/docker/openjdk:11.0.16-oracle
COPY target/greeting-0.0.1-SNAPSHOT.jar app.jar
ENTRYPOINT java -jar app.jar