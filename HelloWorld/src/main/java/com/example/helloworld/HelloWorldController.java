package com.example.helloworld;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
    @RequestMapping
    public String helloWorld()
    {
        return "Hello Abhishek";
    }

    @RequestMapping("/bye")
    public String goodBye()
    {
        return "Bye Bye";
    }
}
