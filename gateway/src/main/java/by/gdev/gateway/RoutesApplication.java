package by.gdev.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class RoutesApplication {

	public static void main(String[] args) {
		SpringApplication.run(RoutesApplication.class, args);
	}

}
