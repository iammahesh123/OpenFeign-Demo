package com.gfg.retrieveservice;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {

    private String username;
    private String email;

    public User(String user1) {
    }
}
