/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gradle.controller;

import com.gradle.DAO.HelloDAO;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Vinh
 */
@RestController
@RequestMapping("/items")
public class HelloController {
    
    @Autowired
    DiscoveryClient client;
    
    @RequestMapping(value = "/client")
    public String hello() {
        List<ServiceInstance> localInstance = client.getInstances("item-service");
        StringBuilder hello = new StringBuilder("Hello World\n");
        localInstance.forEach((service) -> {
            hello.append(service.getServiceId()).append("\t").append(service.getHost()).append("\t").append(service.getPort()).append("\n");
        });
        return hello.toString();
    }
    
    @Autowired
    HelloDAO dao;

    @RequestMapping("/get-all")
    public Object getAll() {
        return dao.getData();
    }
}
