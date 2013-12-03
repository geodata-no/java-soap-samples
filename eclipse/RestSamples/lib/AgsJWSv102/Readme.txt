ArcGIS Java Web Services (AgsJWS) API leverages the SOAP protocol to communicate with ArcGIS Server Services via XML as it's messaging format and HTTP as its messaging transmission.  The API is well suited for Java Enterprise (Java EE) application development in distributed computing environments.   The API provides pure Java objects as value objects in the local JVM which makes them easier to develop with and debug.  The API leverages all the benefits of SOAP based web services, including language/platform agnostic, built in error handling, and designed for distributed computing environments.  

The runtime libraries are located in the Runtime directory whose contents include the following:

The Esri AgsJWS libaries:
    * arcgis_agsws_stubs.jar
    * arcgis_ws_runtime.jar

Dependency libraries:
    * activation.jar
    * commons-codec-1.3.jar
    * commons-httpclient-3.0.1.jar
    * commons-logging-1.0.4.jar
    * jaxb-api.jar
    * jaxb-impl.jar
    * jsr173_1.0_api.jar 

Please review the appropriate dependency license in the License directory.  	

Now you can add the library to a new project or existing project by clicking the 'Add Library' in the New Project dialog and/or the Project Preferences dialog respectively.  In Eclipse, your library is added to the 'User Library' category by default.  Once you select User Library, you can add the appropriate library to your project. 

API Reference:
http://links.esri.com/arcgisserver/soap_api