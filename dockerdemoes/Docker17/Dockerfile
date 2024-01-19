FROM ubuntu:20.04

ENV NAME "Ram"

WORKDIR /app/

COPY . .

##Run multiple commands
RUN echo "Hi">file1.txt && \
    echo echo "Everyone">file2.txt && \
    apt-get update -y && \
    apt-get install -y wget && \
    apt-get install -y openjdk-8-jdk/*

RUN javac *.java

CMD ["java", "Hi"]