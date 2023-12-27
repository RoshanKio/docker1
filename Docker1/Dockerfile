#Dockerfile
FROM ubuntu:20.04
COPY src .
COPY bin .
WORKDIR /tmp/
ENV NAME "Ram"
#Running multiple commands
RUN apt-get update && \
	echo "Hello People">file1.txt && \
	echo "HI Baby">file2.txt && \
	apt-get install -y wget && \
	apt-get install -y openjdk-8-jdk/*


