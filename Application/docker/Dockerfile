# Base image com Tomcat + JDK 17
FROM tomcat:10.1.26-jdk17

# Remove aplicações padrão do Tomcat
RUN rm -rf /usr/local/tomcat/webapps/*

# Copia o WAR gerado pelo Maven para o Tomcat como aplicação raiz
COPY target/Tomcat_Servlet_JSP-1.0-SNAPSHOT.war /usr/local/tomcat/webapps/ROOT.war

# Expõe a porta padrão do Tomcat
EXPOSE 8080

# Inicia o Tomcat
CMD ["catalina.sh", "run"]