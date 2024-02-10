# SprinbootToDocker
FIRST INSTALL DOCKER DESKTOP
SECONDLY INSTALL ECLIPSE
CREATE SRING BOOT PROJECT ADD DEPENDENCY “WEB”
CREATE A MAVEN TYPE PROJECT 
IMPORT IT IN ECLIPSE
MAKE SURE PULL THE JDK IN DOCKER DESKTOP
Docker pull jdk command
        docker pull openjdk:11   
CREATE A DOCKER FILE WITH NAME “Dockerfile”
PUT IT IN TARGET FOLDER IN SPRINBOOT PROJECT 
CODE
/*
FROM openjdk:17
VOLUME /tmp
ADD target/Dockertest-0.0.1-SNAPSHOT.jar jarfile.jar
RUN bash -c 'touch /jarfile.jar'
ENTRYPOINT [ "java", "-jar", "/jarfile.jar" ]
*/

CREATE JAR FILE OPEN POM FILE RIGHT CLICK THEN MAVEN BUILD JAR FILE IS CREATED INSIDE TARGET FOLDER OF SPRING BOOT PROJECT
COPY THE JAR FILE NAME IN DOCKER FILE
 RUN DOCKER DESKTOP
 OPEN WINDOWS POWERSHELL
 RUN THIS COMMAND TO BUILD AN IMAGE
                                        docker build -t myimage .
RUN THIS COMMAND GO TO DOCKER TEST FOLDER
         C:\Users\Lehar Agrawal\Desktop\Dockertest\Dockertest>docker run -it --name bootimage4 -p 8081:8080 myimage
//BOOTIMAGE4(CONTAINER NAME)
//MYIMAGE(IMAGE NAME)

No need to run the spring boot application in eclipse
Run it on powershell BY WRITING THE ABOVE COMMAND
 
This will come then check the local host port 8081
//spring boot project runn this type of message you can see on powershell
![image](https://github.com/Lehar1107/SprinbootToDocker/assets/126607616/08a4eae4-7861-4404-90ba-923de61a63a7)

The message you have send from spring is now on local host using docker
WRITE
      localhost:8081 
      output will be shown whatever you have send the message.
