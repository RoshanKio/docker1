FROM ubuntu

VOLUME ["/volume1"]

ENV NAME "Ram"

WORKDIR /app/

COPY . .

RUN echo "Hi">file1.txt && \
    echo "Everyone">file2.txt && \
    apt-get update -y && \
    apt-get install -y wget && \
    apt-get install -y openjdk-8-jdk/*

RUN javac *.java

CMD ["java", "Test2", "1", "0", "-1", "-2"]