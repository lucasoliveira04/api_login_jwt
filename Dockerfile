FROM ubuntu:latest AS build

RUN apt-get update && apt-get install -y openjdk-17-jdk maven && apt-get clean
COPY . .

RUN mvn clean install

FROM openjdk:17-jdk-slim

EXPOSE 3000

COPY --from=build /target/api_login_jwt-0.0.1.jar app.jar

ENTRYPOINT ["java", "-jar", "app.jar"]
