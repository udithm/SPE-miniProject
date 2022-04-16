FROM openjdk:11
COPY ./target/mini-project-1.0-SNAPSHOT-jar-with-dependencies.jar ./
WORKDIR ./
CMD ["java", "-jar", "mini-project-1.0-SNAPSHOT-jar-with-dependencies.jar"]