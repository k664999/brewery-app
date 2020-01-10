FROM openjdk:11-jdk

LABEL maintainer="kamil.adamczyk"

VOLUME /tmp

EXPOSE 8080

ARG JAR_FILE=brewery-microservice/target/brewery-microservice-0.0.1-SNAPSHOT.jar

ADD ${JAR_FILE} brewery-microservice-0.0.1-SNAPSHOT.jar

ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/brewery-microservice-0.0.1-SNAPSHOT.jar"]