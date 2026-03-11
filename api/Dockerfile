# Estágio 1: Compilação (Maven) - Usando uma imagem estável
FROM maven:3.8-eclipse-temurin-17 AS build
WORKDIR /app
COPY pom.xml .
COPY src ./src
RUN mvn clean package -DskipTests

# Estágio 2: Execução - Usando a imagem atualizada do Java 17
FROM eclipse-temurin:17-jdk-jammy
WORKDIR /app
# Copiamos o arquivo gerado (o .jar) do estágio anterior
COPY --from=build /app/target/*.jar app.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "app.jar"]