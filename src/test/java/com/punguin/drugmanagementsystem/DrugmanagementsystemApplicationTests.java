package com.punguin.drugmanagementsystem;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.web.client.RestTemplate;

import java.net.MalformedURLException;
import java.net.URL;

@SpringBootTest
class DrugmanagementsystemApplicationTests {

    @Autowired
    RestTemplateBuilder restTemplateBuilder;



    @Test
    void contextLoads() throws MalformedURLException {
        RestTemplate restTemplate1 = restTemplateBuilder.build();

        URL url = new URL("http://127.0.0.1:8080/hello");

        System.out.println(url);

        String forObject = restTemplate1.getForObject("http://127.0.0.1:8080/hello", String.class);

        System.out.println(forObject);
    }

}
