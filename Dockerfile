FROM openjdk:11-jre

MAINTAINER Henryk Konsek <hekonsek@gmail.com>

ARG JAR_FILE
ADD target/${JAR_FILE} /usr/share/myservice/myservice.jar

ENTRYPOINT ["/usr/local/openjdk-11/bin/java", "-jar", "/usr/share/myservice/myservice.jar"]