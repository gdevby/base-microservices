package by.gdev.test.service.service;

import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;

import by.gdev.test.service.config.ApplicationProperty;
import lombok.RequiredArgsConstructor;
import reactor.core.publisher.Mono;

@RequiredArgsConstructor
@Service
public class AppHandler {

	private final ApplicationProperty property;
	private final WebClient.Builder loadBalancedWebClientBuilder;

	public Mono<ServerResponse> message(ServerRequest request) {
		return ServerResponse.ok().bodyValue(property.getTest());
	}

	public Mono<ServerResponse> testBalancer(ServerRequest request) {
		return ServerResponse.ok().bodyValue(loadBalancedWebClientBuilder.build().get()
				.uri("http://test-service/message").retrieve().bodyToMono(String.class));
	}
}
