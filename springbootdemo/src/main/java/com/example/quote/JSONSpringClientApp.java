package com.example.quote;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class JSONSpringClientApp {

    private static final Logger log = LoggerFactory.getLogger(JSONSpringClientApp.class);

    public static void main(String args[]) {
        log.info("before SpringApplication.run...");
        SpringApplication.run(JSONSpringClientApp.class);
        log.info("after SpringApplication.run...");
    }

    @Bean
    public RestTemplate restTemplate(RestTemplateBuilder builder) {
        log.info("enter restTemplate...");
        return builder.build();
    }

    @Bean
    public CommandLineRunner run(RestTemplate restTemplate) throws Exception {
        log.info("enter run...");
        return args -> {
            Quote quote = restTemplate.getForObject(
                    "https://gturnquist-quoters.cfapps.io/api/random", Quote.class);
            log.info(quote.toString());
        };
    }
}

