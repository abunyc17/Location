# Location
A simple spring boot web application for performing CRUD operations.
Ability to send email (Email Utility using JavaMailSender API)
Added JfreeChart dependency ( Report generation of pie-chart for urban & rural locations)

#Connected to mySql database

#Jasper Dependency needed for embedded tomcat & to run spring mvc
<dependency>
		<groupId>org.apache.tomcat.embed</groupId>
		<artifactId>tomcat-embed-jasper</artifactId>
		<scope>provided</scope>
</dependency>
     
<!-- Jstl (Expression Language dependency) -->
<dependency>		
		<groupId>javax.servlet</groupId>
		<artifactId>jstl</artifactId>
</dependency>

<!-- mail dependency -->
<dependency>
	<groupId>org.springframework.boot</groupId>
	<artifactId>spring-boot-starter-mail</artifactId>
</dependency>

<!-- jfreechart maven dependency -->
<dependency>
	<groupId>org.jfree</groupId>
	<artifactId>jfreechart</artifactId>
	<version>1.0.19</version>
</dependency>


