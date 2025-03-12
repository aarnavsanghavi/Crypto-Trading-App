package com.SEProject.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping
    public String home() {

        return "Welcome to this Crypto Tradingg Platform";
    }

    @GetMapping("/api")
    public String secure(){

        return "secure!!";
    }
}
