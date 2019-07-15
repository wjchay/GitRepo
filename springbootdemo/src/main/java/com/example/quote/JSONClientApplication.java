package com.example.quote;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.client.RestTemplate;

public class JSONClientApplication {


    private static final Logger log = LoggerFactory.getLogger(JSONClientApplication.class);

    public static void main(String args[]) {
        RestTemplate restTemplate = new RestTemplate();
        Quote quote = restTemplate.getForObject("https://gturnquist-quoters.cfapps.io/api/random", Quote.class);
        log.info(quote.toString());
    }
}
