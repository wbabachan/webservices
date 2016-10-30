# Sample Code for Java EE Webservices 

In this example you can test how webservices in Java EE work. It contains two Projects:

`webservices`  
This project contains the code for serverside webservices.

`webservices-client`  
This project contains the code for clientside webservices.

In order to test webservices use gradle to build both projects, `./gradlew clean build` then import them in IDE. 

First of all you have to start serverside Webservices, Project *webservices*, There is two way to start serverside Webservices: 

1. Deploy the project war file *webservices-1.0.war* to an application server like Glassfish. 
2. Start *webservices.Publisher* class that contains endpoint publish definition.

After starting Webservices Server, please copy get the *wsdl* and *xsd* files by calling http://localhost:8081/webservices-1.0/ProductService?wsdl and http://localhost:8081/webservices-1.0/ProductService?xsd and copy them to *webservices-client* project, to *webservices-client/src/resources/wsdl* folder and build the project with gradle, in order to get the war file. Deploy the war file to an application server and start it. Now you can use the webservices by calling the url http://localhost:8080/webservices-client-1.0/ProductFinder Alternativly you can start the java class *webservices-client/src/java/client/ProductFinder.java* without deploying a war file.

Enjoy it !

