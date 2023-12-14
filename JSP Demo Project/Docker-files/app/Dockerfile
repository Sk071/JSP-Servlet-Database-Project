FROM tomcat:9-jdk11
ADD ROOT.war /usr/local/tomcat/webapps/ROOT.war
ADD mysql-connector-j-8.2.0.jar /usr/local/tomcat/lib/mysql-connector-j-8.2.0.jar
CMD ["catalina.sh", "run"]
