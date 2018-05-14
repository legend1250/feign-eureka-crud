/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gradle.controller;

import com.gradle.DAO.HelloDAO;
import com.gradle.model.UserDTO;
import java.util.HashMap;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Vinh
 */
@RestController
public class HelloController {
    
    @Autowired
    DiscoveryClient client;
    
    @RequestMapping("/client")
    public String hello() {
            List<ServiceInstance> localInstance = client.getInstances("hello-service");
            return "Hello World: "+ localInstance.get(0).getServiceId()+":"+localInstance.get(0).getHost()+":"+localInstance.get(0).getPort();
    }
    
    @Autowired
    HelloDAO dao;

    @RequestMapping("/items/get-all")
    public Object getAll() {
        return dao.getData();
    }
}
