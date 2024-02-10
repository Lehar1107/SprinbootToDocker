
# EXPOSE 8080

FROM openjdk:17
VOLUME /tmp

# WORKDIR /usr/src/myapp
# COPY  . /usr/src/myapp/

ADD target/Dockertest-0.0.1-SNAPSHOT.jar jarfile.jar
RUN bash -c 'touch /jarfile.jar'
ENTRYPOINT [ "java", "-jar", "/jarfile.jar" ]

