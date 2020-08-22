FROM alpine:edge

# install bash
RUN \
  apk add --no-cache bash

# install java
RUN \
  apk add --no-cache openjdk14-jdk-alpine

EXPOSE 8091

ADD target/property-api-0.0.1-SNAPSHOT.jar app.jar

ENTRYPOINT exec java $JAVA_OPTS -Djava.security.egd=file:/dev/./urandom -jar /app.jar