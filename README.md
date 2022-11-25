# base-microservices
Implemented load balancer of configuration git, eureka and test service<br>
To test, you need to run application with command<br>
 build every module
cd config &&  mvn clean install<br>
cd eureka && mvn clean install<br>
cd test-service && mvn clean install<br>
docker compose up<br>
and wait 30 seconds and execute  http://127.0.0.1:8003/testbalancer, it should be return message with balancer<br>

