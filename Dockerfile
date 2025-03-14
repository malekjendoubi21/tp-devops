FROM openjdk:8-jdk-alpine
EXPOSE 8089
ADD http://192.168.56.10:8082/repository/maven-releases/tn/esprit/exam/1.0.0/exam-1.0.0.jar timesheet-devops-1.0.jar
ENTRYPOINT ["java","-jar","/timesheet-devops-1.0.jar"]
