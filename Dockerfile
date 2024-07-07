FROM openjdk:17
EXPOSE 8086
ADD target/questionnaire-service-docker.jar questionnaire-service-docker.jar
ENTRYPOINT ["java", "-jar", "questionnaire-service-docker.jar"]


#
# Build stage
#
#FROM openjdk:17 AS build
#COPY src /home/app/src
#COPY pom.xml /home/app
#EXPOSE 8080
#ADD target/questionnaire-service-docker.jar questionnaire-service-docker.jar
#ENTRYPOINT ["java","-jar","/questionnaire-service-docker.jar"]


# Copy the JAR package into the image
#ARG JAR_FILE=target/*.jar
#COPY ${JAR_FILE} app.jar
#EXPOSE 8090
#ENTRYPOINT ["java", "-jar", "/app.jar"]