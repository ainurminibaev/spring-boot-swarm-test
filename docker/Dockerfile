FROM adoptopenjdk/openjdk11:alpine-jre
VOLUME /tmp
ADD app.jar app.jar
ADD application.properties application.properties
ENV JAVA_OPTS="-Dspring.config.location=/application.properties"
ENTRYPOINT [ "sh", "-c", "java $JAVA_OPTS -Djava.security.egd=file:/dev/./urandom -jar /app.jar" ]