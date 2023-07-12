package com.example.API_summerchool;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

@RestController
public class API_Control {

    private final WebClient webClient;
    private final WebClient webClient1;

    public API_Control(WebClient.Builder webClientBuilder, WebClient.Builder webClientBuilder1) {
        this.webClient = webClientBuilder.baseUrl("https://ipapi.co").build();
        this.webClient1 = webClientBuilder1.baseUrl("https://api.openweathermap.org/data/2.5/weather").build();
    }

    @GetMapping("/ipdata/{ip}")
    public Mono<IpData> getIpData(@PathVariable String ip) {
        return webClient.get()
                .uri("/{ip}/json/", ip)
                .retrieve()
                        .bodyToMono(IpData.class);
        }
        }
e