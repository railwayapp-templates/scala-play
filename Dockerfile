# Use the Scala sbt official image
# https://hub.docker.com/r/sbtscala/scala-sbt/tags
FROM sbtscala/scala-sbt:eclipse-temurin-21.0.5_11_1.10.5_3.5.2

# Create and change to the app directory.
WORKDIR /app

# Copy local code to the container image.
COPY . ./

# Build the app.
RUN sbt stage

# Run the app
CMD ["./target/universal/stage/bin/main"]