FROM openjdk:11
COPY target/ConversionDemo-0.0.1-SNAPSHOT.jar conversionDemo.jar
ENTRYPOINT ["java","-jar","/conversionDemo.jar"]


#docker build --tag=conversiondemo:latest .
#docker run -p8080:8080 conversiondemo:latest