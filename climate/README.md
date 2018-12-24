Required/Utilized Technologies 
------------------------------
Java 
Spring Boot
Spring, Spring MVC
Spring Rest
Logging technology
CSS 
Javascript
JQuery
DataTables
AJAX 
JSON
Maven
JPA
H2

Setup
------
Import climate project into STS as existing maven project and run as "Spring Boot App"

or

Do install Java/Maven and setup environment in project home directory
---------------------------------------------------------------------
@echo off  
set JAVA_HOME={home directory}\Java\jdk1.8.0_181
set M2_HOME={home directory}\apache-maven-3.6.0
set M2=%M2_HOME%\bin
set PATH=%JAVA_HOME%\bin;%M2%;%PATH%

From project home directory execute the following command to install and start the server
-------------------------------------------------------------------------------------------------------------
from terminal one:
------------------
mvn clean install
mvn spring-boot:run

Once server start , access application http://localhost:8080/climate


