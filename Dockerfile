# Build stage
FROM debian:bookworm-slim AS build

# Install Maven and required tools
RUN apt-get update -y && \
    apt-get install -y maven docker.io && \
    apt-get clean all

WORKDIR /usr/src/app

# Copy pom.xml and download dependencies
COPY pom.xml .
RUN mvn dependency:go-offline

# Copy source code
COPY . .

# Build the native image using buildpacks
RUN mvn -DskipTests spring-boot:build-image
