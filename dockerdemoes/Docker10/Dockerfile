FROM ubuntu:20.04

WORKDIR /tmp/

COPY . .

ENV NAME "Ram"

EXPOSE 8080

#Multiple lines of code
RUN echo "Hi">file1.txt && \
    echo "Everyone">file2.txt && \
    apt-get update -y && \
    apt-get install -y wget && \
    apt-get install -y tomcat9 tomcat9-admin/*

#RUN javac *.java

#CMD ["service", "tomcat9", "start"]

