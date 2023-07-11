package com.example.API_summerchool;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

@RestController
public class API_Control {

    private final WebClient webClient;

    public API_Control(WebClient.Builder webClientBuilder) {
        this.webClient = webClientBuilder.baseUrl("https://ipapi.co").build();
    }

    @GetMapping("/ipdata/{ip}")
    public Mono<IpData> getIpData(@PathVariable String ip) {
        return webClient.get()
                .uri("/{ip}/json/", ip)
                .retrieve()
                .bodyToMono(IpData.class);
    }
}
