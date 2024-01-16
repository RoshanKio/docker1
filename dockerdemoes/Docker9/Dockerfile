FROM ubuntu:20.04

WORKDIR /tmp/

COPY . .

ENV NAME Ram

#Running multiple commands
RUN echo "HI">file1.txt && \
    echo "Ebrybody">file2.txt && \
    apt-get update -y && \
    apt-get install -y wget && \
    apt-get install -y openjdk-8-jdk/*

RUN javac *.java

CMD ["java", "Hi"]

