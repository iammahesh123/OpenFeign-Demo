package com.gfg.retrieveservice.client;

import org.reactivestreams.Publisher;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "user-service", url = "https://localhost:8081/users")
public interface UserServiceClient {
    @GetMapping("/users")
    Publisher<?> getAllUsers();
}