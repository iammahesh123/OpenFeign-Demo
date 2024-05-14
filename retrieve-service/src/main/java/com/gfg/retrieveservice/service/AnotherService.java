package com.gfg.retrieveservice.service;

import com.gfg.retrieveservice.User;
import com.gfg.retrieveservice.client.UserServiceClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AnotherService {

    @Autowired
    private UserServiceClient userServiceClient;

    public List<User> getAllUsers() {
        return (List<User>) userServiceClient.getAllUsers();
    }
}
