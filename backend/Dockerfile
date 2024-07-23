FROM maven:3.8.4-openjdk-17 AS builder
WORKDIR /build
COPY . /build
RUN mvn -B clean package

FROM openjdk:17-jdk-slim
WORKDIR /backend
COPY --from=builder /build/target/backend-0.0.1-SNAPSHOT.jar /backend/backend.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "backend.jar"]