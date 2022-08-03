FROM tomcat:9.0.62-jre8-openjdk
COPY ./target/war-app-1.0.war $CATALINA_HOME/webapps/sample.war
