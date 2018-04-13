FROM openjdk:8-jdk-alpine

RUN adduser -S brian

RUN mkdir -p /app/lib
RUN mkdir /app/config

ADD build/libs/hello-world.jar /app/lib/hello-world.jar

USER brian

ENTRYPOINT ["java","-jar","/app/lib/hello-world.jar"]