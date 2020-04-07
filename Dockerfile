FROM java:8
WORKDIR /taccount
COPY target/account-server-0.0.1-SNAPSHOT.jar /taccount/taccount.jar
EXPOSE 8181
ENTRYPOINT ["java","-Xms200m","-Xmx300m","-jar","/taccount/taccount.jar"]