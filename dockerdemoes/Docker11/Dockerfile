FROM ibtech/tomcat9

ENV NAME "Ram"

WORKDIR /tmp/

COPY Hi.java .

COPY app14.war /usr/local/tomcat/webapps

EXPOSE 8080

#Multiple lines of code
RUN echo "Hi">file1.txt
RUN echo "Everyone">file2.txt

