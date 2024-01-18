FROM ubuntu:20.04

WORKDIR /myapp/

ENV NAME "Ram"

COPY . .

#Running multiple commands
RUN echo "Hi">file1.txt && \
    echo "Every0ne">file2.txt && \
    apt-get update -y && \
    apt-get install -y wget && \
    apt-get install -y openjdk-8-jdk/*

RUN javac *.java

CMD ["java", "Hi"]


