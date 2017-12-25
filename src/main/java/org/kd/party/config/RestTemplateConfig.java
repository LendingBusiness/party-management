package org.kd.party.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class RestTemplateConfig {

    @Value("${server.port}")
    private String serverPort;

    @Bean
    public RestTemplate countryRestTemplate(RestTemplateBuilder restTemplateBuilder) {
        return restTemplateBuilder.rootUri("http://localhost:" + serverPort).build();
    }
}
