FROM ubuntu:20.04

WORKDIR /app/

COPY . .

ENV NAME "Ram"


#Running multiple commands
Run echo "Hi">file1.txt && \
    echo "Everyone">file2.txt && \
    apt-get update -y && \
    apt-get install -y wget && \
    apt-get install -y openjdk-8-jdk/*

Run javac *.java

CMD ["java", "Hi"]

