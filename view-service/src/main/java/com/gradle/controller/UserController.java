/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gradle.controller;

import com.gradle.feign.UserClient;
import com.gradle.model.ItemDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Vinh
 */
@RestController
@Component
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserClient user;
    
    @RequestMapping(value = "/client")
    public String hello(){
        return user.hello();
    }
    
    @RequestMapping(value = "/test")
    public Object getData(){
        return user.getData();
    }
}
