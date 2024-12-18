# Используем образ OpenJDK
FROM openjdk:17-jdk-slim

# Устанавливаем рабочую директорию
WORKDIR /coffee-api

# Копируем JAR-файл в контейнер
COPY target/coffee-api-0.0.1-SNAPSHOT.jar app.jar

# Открываем порт, на котором работает приложение (например, 8080)
EXPOSE 4322

# Команда для запуска приложения
ENTRYPOINT ["java", "-jar", "app.jar"]