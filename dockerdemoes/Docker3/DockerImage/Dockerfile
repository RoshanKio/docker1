FROM ubuntu:20.04
COPY Dt.java .
WORKDIR /tmp/
ENV NAME "Roshan"
#Running multiple commands
RUN apt-get update && \
	echo "Hello People">file1.txt && \
	echo "HI Baby">file2.txt && \
	apt-get install -y wget && \
	apt-get install -y openjdk-8-jdk/*