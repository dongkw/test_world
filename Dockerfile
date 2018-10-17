FROM java:9

MAINTAINER kw

EXPOSE 8080

ENTRYPOINT ["java", "-jar", "world.jar"]

ADD build/libs/world-*.jar world.jar
