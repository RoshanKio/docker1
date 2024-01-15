FROM ubuntu:20.04
WORKDIR /tmp/
COPY . .
ENV NAME "Ram"
#Running multiple commands
RUN apt-get update && \
    echo "Hello People">file1.txt && \
    echo "HI Baby"> file2.txt && \
    apt-get install -y wget && \
    apt-get install -y openjdk-8-jdk/*
RUN javac Hi.java
CMD ["java", "Hi"]
