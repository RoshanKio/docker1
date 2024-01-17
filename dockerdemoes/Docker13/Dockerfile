FROM ubuntu:20.04

WORKDIR /tmp/

COPY . .

ENV NAME "Ram"

#Running Multiple commands
RUN echo "Hi">file1.txt && \
    echo "Everyone">file2.txt && \
    apt-get update -y && \
    apt-get install -y wget && \
    apt-get install -y openjdk-8-jdk/*


RUN javac *.javac


CMD ["java", "Hi"]

