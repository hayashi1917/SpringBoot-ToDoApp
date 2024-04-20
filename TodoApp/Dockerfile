FROM gradle:7
WORKDIR /app
COPY . .
RUN chmod +x gradlew
CMD ["./gradlew", "bootRun"]