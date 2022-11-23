package by.gdev.test.service.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.RouterFunctions;
import org.springframework.web.reactive.function.server.ServerResponse;

import by.gdev.test.service.service.AppHandler;

@Configuration
@EnableScheduling
public class BeanConfiguration {
	@Bean
	ApplicationProperty applicationPropertyCreate() {
		return new ApplicationProperty();
	};

	@Bean
	RouterFunction<ServerResponse> routs(AppHandler handler) {
		return RouterFunctions.route().GET("/message", handler::message).build();
	}

}
