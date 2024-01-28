FROM ubuntu

VOLUME ["volume1"]

ENV NAME "Krishna"

WORKDIR /app/

COPY . .

#Run multiple COmmands
RUN echo "Hi">file1.txt && \
    echo "Everyone">file2.txt && \
    apt-get update -y && \
    apt-get install -y wget && \
    apt-get install -y openjdk-8-jdk/*

RUN javac *.java

CMD ["java", "Test3", "3", "2", "1", "0", "-1"]