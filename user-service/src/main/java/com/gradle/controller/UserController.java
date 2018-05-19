/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gradle.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.gradle.DAO.UserDAO;

/**
 *
 * @author Vinh
 */
@RestController
@RequestMapping("/users")
public class UserController {
    
    @Autowired
    DiscoveryClient client;
    
    @RequestMapping(value = "/client")
    public String hello() {
        List<ServiceInstance> localInstance = client.getInstances("user-service");
        StringBuilder hello = new StringBuilder("Hello World\n");
        for(ServiceInstance service: localInstance){
            hello.append(service.getServiceId() + "\t" + service.getHost() + "\t" + service.getPort() +"\n");
        }
        return hello.toString();
    }
    
    @Autowired
    UserDAO dao;

    @RequestMapping("/get-all")
    public Object getAll() {
        return dao.getData();
    }
}
