package com.gfg.retrieveservice.client;

import org.reactivestreams.Publisher;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public UserServiceClient userServiceClient() {
        return new UserServiceClient() {
            @Override
            public Publisher<?> getAllUsers() {
                return getAllUsers();
            }
        };
    }
}

