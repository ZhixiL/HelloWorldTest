package com.example.HelloworldTest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @RequestMapping("/")
    public String index()
    {
        return "Hello World from MacOS through branch br2!";
    }
}
