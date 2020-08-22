FROM openjdk:14-alpine

# install bash
RUN \
  apk add --no-cache bash

EXPOSE 8091

ADD target/property-api-0.0.1-SNAPSHOT.jar app.jar

ENTRYPOINT exec java $JAVA_OPTS -Djava.security.egd=file:/dev/./urandom -jar /app.jar