# -------- STAGE 1 : BUILD --------
FROM maven:3.9.6-eclipse-temurin-21 AS build

WORKDIR /app

# Copier pom.xml d'abord pour cache Maven
COPY pom.xml .

# Télécharger les dépendances
RUN mvn dependency:go-offline

# Copier le reste du projet
COPY src ./src

# Build le projet
RUN mvn clean package -DskipTests


# -------- STAGE 2 : RUN --------
FROM eclipse-temurin:21-jdk

WORKDIR /app

# Copier le jar depuis le stage build
COPY --from=build /app/target/*.jar app.jar

# Exposer le port (informative)
EXPOSE 8080

# Lancer l'application
ENTRYPOINT ["java","-jar","app.jar"]
