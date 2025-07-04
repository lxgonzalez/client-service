FROM eclipse-temurin:23-jdk-alpine

WORKDIR /app

COPY . ./

RUN chmod +x ./mvnw

RUN ./mvnw -DoutputFile=target/mvn-dependency-list.log -B -DskipTests clean dependency:list install

EXPOSE 80

CMD ["sh", "-c", "java -jar target/*.jar"]