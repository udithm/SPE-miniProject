FROM openjdk:11
COPY ./target/SPE-MiniProject-1.0-SNAPSHOT-jar-with-dependencies.jar ./
WORKDIR ./
CMD ["java", "-jar", "SPE-MiniProject-1.0-SNAPSHOT-jar-with-dependencies.jar"]