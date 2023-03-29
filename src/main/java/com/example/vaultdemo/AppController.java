package com.example.vaultdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppController {

    @Autowired
    private MyConfiguration myConfiguration;

    @GetMapping("/getUser")
    public String getUser() {
        return "Username : " + myConfiguration.getToken() + ", Password : " + myConfiguration.getToken();
    }
}
