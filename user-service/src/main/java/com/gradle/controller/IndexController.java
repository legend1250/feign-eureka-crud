package com.gradle.controller;

import com.gradle.feign.HelloClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Component
public class IndexController {
    
    @Autowired
    private HelloClient hello;
    
    @RequestMapping(value = "/client")
    public String hello(){
        return hello.hello();
    }
    
    @RequestMapping(value = "/test")
    public Object getData(){
        return hello.getData();
    }
}
