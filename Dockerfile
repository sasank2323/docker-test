FROM openjdk:17

COPY target/demo-app.jar  /usr/app/

WORKDIR /usr/app/

EXPOSE 8232

ENTRYPOINT ["java", "-jar", "demo-app.jar"]