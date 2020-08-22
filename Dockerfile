FROM alpine:edge

# install bash
RUN \
  apk add --no-cache bash

# install java
RUN \
  apk add --no-cache openjdk8

EXPOSE 8091

ADD target/property-api-1.0-SNAPSHOT.jar app.jar

ENTRYPOINT exec java $JAVA_OPTS -Djava.security.egd=file:/dev/./urandom -jar /app.jar