package com.gfg.retrieveservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class RetrieveServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(RetrieveServiceApplication.class, args);
    }

}
