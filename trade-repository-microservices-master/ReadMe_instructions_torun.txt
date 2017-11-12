Instructions about how to run the Trade repository services
Prerequisites for running the application:
a)Java 1.8 and above
b)maven.

1)Clone or download the project from github.
2) import the project into eclipse or sts as maven project and build it.
3)Once done start the services in the following order
 a)start Trade-repo-discovery-service from the main class(TradeRepoEurekaServerApplication):This service is used for service resgistration discovery and monitoring of the services which is done using eureka
 b)start gateway service from the main class(GateWayApplication) :This service is a Zuul server which is used as a API gateway which acts as a single entry point into any service.
  This gateway service provides dynamic routing, monitoring, resiliency and security.
 c)Start Trade-input-service from the main class(TradeRepoInputServiceApplication):This service is used to store the trades from the trade information from the front office
 d)start Trade-output-service from the main class(TradeRepoOutputServiceApplication):This service is used to fetch the trade details needed for different back offices.
 
 Service Urls:
 Once All the services are started we can check the status of the services in the following eureka url
  http://localhost:8761/
  
 TO check the swagger UI and documentation of the services please check the following url :
 http://localhost:8765/swagger-ui.html 
 
 