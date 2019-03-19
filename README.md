# currency-conversion-microservices

Summary:

	This small project is just to learn micro services in terms of what are the components involved and how they work together 
to accomplish a certain functionality. There are two micro services used in this project to convert USD/EUR/AUD to INR. 
The currency conversion services takes fromCurrency, toCurrency and quantity as inputs and returns the converted INR amount.
The conversion rate is retrieved from a ExchangeRate H2 database table which is pre-loaded when the srver starts. 
Both services details can be obtained from Swagger Documentation included in the projects...
	
Currency Conversion Microservice

	URL: 
		Direct Call: http://localhost:8100/currency-converter/from/USD/to/INR/quantity/10
		Call through Ribbon:  http://localhost:8100/currency-converter-feign/from/USD/to/INR/quantity/10
		
	This service calls currency exchange microservice to get the exchange rate and then it returns exchange rate multiplied by quantity.
	The Direct call, calls currency exchange service running on port 8000.
	Call through ribbon calls one of the running instances of a currency exchange service in a round robin manner. 
		This can be configured to call running instances based on the load as well.
	
Currency Exchange Microservice

	Currency exchange service gets the exchange rate from a exchagerate H2 database table. This is in memory database used for this mini project.
	And returns the exchange rate to currency conversion service.

	URL: http://localhost:8000/currency-exchange/from/USD/to/INR
		 http://localhost:8001/currency-exchange/from/EUR/to/INR
		 http://localhost:8002/currency-exchange/from/AUD/to/INR

Ribbon - Client side load balancer
	Ribbon calls Eureka naming server to know the active instances of currency exchange service. 
	Ribbon also polls Erueka to know active instances at certain intervals and which can be configured.

Eureka Naming Server

	Currency conversion and exchange services are registered with Erueka naming server using @EnableDiscoveryClient annotation.
	Whenever the service registered started, it will get registered with Eureka and Ribbon can then use them.

	URL: http://localhost:8761
  
H2 Database URL
  http://localhost:8000/h2-console/
  
Swagger URL
  For Currency Conversion Service - http://192.168.1.7:8100/swagger-ui.html
  For Currency Exchange Service - http://192.168.1.7:8000/swagger-ui.html
  
