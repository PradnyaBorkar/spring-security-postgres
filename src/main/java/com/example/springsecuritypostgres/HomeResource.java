package com.example.springsecuritypostgres;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeResource {

    @GetMapping("/")
    public String home(){
        return "Welcome" ;
    }

    @GetMapping("/user")
    public String getUser(){
        return "Welcome user";
    }

    @GetMapping("/admin")
    public String getAdmin(){
        return "Welcome admin";
    }

}
