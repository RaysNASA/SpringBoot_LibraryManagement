package com.lwz.springboot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
    @RequestMapping("/hw")
    public String sayHi(){

        return "Hello SpringBoot!";
    }
}
