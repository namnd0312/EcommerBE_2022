FROM openjdk:8-jdk-alpine
VOLUME /tmp
ADD target/ecommerBE-0.0.1-SNAPSHOT.jar ecommerBE.jar
ENTRYPOINT exec java -jar ecommerBE.jar


ENV JDBC_DATABASE_URL=jdbc:'mysql://172.17.0.2:5432/testdb?createDatabaseIfNotExist=true'
ENV JDBC_DATABASE_USERNAME=postgres
ENV JDBC_DATABASE_PASSWORD=123456
ENV JDBC_DATABASE_DRIVER=org.postgresql.Driver
ENV SPRING_JPA_HIBERNATE_DIALECT=org.hibernate.dialect.PostgreSQLDialect
