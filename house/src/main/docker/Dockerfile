FROM frolvlad/alpine-oraclejdk8:slim
VOLUME /tmp
ADD docker_springboot_house.jar app.jar
RUN sh -c 'touch /app.jar'
ENV JAVA_OPTS=""
ENTRYPOINT [ "sh", "-c", "java $JAVA_OPTS -jar /app.jar" ]
