Get started with db2rca
-----------------------------------
Welcome to Java Web Starter application!

This sample application demonstrates how to write a Java Web application (powered by WebSphere Liberty) and deploy it on Bluemix.

1. [Install the cf command-line tool](https://www.stage1.ng.bluemix.net/docs/#starters/BuildingWeb.html#install_cf).
2. [Download the starter application package](https://ace.stage1.ng.bluemix.net:443/rest/../rest/apps/9726c349-cac9-4a52-a6e7-d2cd5f1f5694/starter-download).
3. Extract the package and `cd` to it.
4. Connect to Bluemix:

		cf api https://api.stage1.ng.bluemix.net

5. Log into Bluemix:

		cf login -u bbalothi@in.ibm.com
		cf target -o bbalothi@in.ibm.com -s dev
				
6. Compile the Java code and generate the war package using ant.
7. Deploy your app:

		cf push db2rca -p webStarterApp.war

8. Access your app: [http://db2rca.stage1.mybluemix.net](http://db2rca.stage1.mybluemix.net)
