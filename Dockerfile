FROM openjdk:17
EXPOSE 8080
ADD target/ScientificCalculator.jar ScientificCalculator.jar
ENTRYPOINT ["java","-jar","/ScientificCalculator.jar"]