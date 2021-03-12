FROM openjdk:8
COPY ./target/DevOps_Calculator-1.0-SNAPSHOT.jar ./
WORKDIR ./
CMD ["java", "-cp", "DevOps_Calculator-1.0-SNAPSHOT.jar", "App"]