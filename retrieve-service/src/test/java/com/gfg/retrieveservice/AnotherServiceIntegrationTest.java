package com.gfg.retrieveservice;


import com.gfg.retrieveservice.client.UserServiceClient;
import com.gfg.retrieveservice.service.AnotherService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.mock.mockito.MockBean;


import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static reactor.core.publisher.Mono.when;


public class AnotherServiceIntegrationTest {

    @Autowired
    private AnotherService anotherService;

    @MockBean
    private UserServiceClient userServiceClient;

    @Test
    public void testGetAllUsers() {
        // Mock the response from Feign client
        when(userServiceClient.getAllUsers()).thenReturn(List.of(new User("user1"), new User("user2")));

        // Call the service method
        List<User> users = anotherService.getAllUsers();

        // Verify the result
        assertEquals(2, users.size());
        assertEquals("user1", users.get(0).getUsername());
        assertEquals("user2", users.get(1).getUsername());
    }
}
