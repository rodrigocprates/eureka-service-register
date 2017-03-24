## Register 2 services instances on Eureka server.

## eureka-service - Build & Run

mvn install

run EurekaServerApplication.java (port 8761)

- http://localhost:8761 to see Eureka dashboard.

- see application.yml

## rest-service - Build & Run

mvn install

mvn spring-boot:run -Dserver.port=9097
Working on http://localhost:9097/greeting

mvn spring-boot:run -Dserver.port=9999
Working on http://localhost:9999/greeting

- see application.yml

## Next

Check on eureka-service console, when rest-server gets up it connects to eureka end gets registered.

	INFO 1848 --- [nio-8761-exec-7] c.n.e.registry.AbstractInstanceRegistry  : Registered instance REST-SERVICE/10.99.1.97:rest-service with status UP (replication=false)

Check http://localhost:8761 to see your two rest-service instances on Eureka.
