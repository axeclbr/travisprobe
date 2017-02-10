FROM java:8-alpine
MAINTAINER Your Name <you@example.com>

ADD target/uberjar/travisprobe.jar /travisprobe/app.jar

EXPOSE 3000

CMD ["java", "-jar", "/travisprobe/app.jar"]
