From java:8
COPY target/calculator-0.0.1-SNAPSHOT.jar /tmp/
WORKDIR /tmp
ENTRYPOINT ["java", "-jar", "calculator-0.0.1-SNAPSHOT.jar"]