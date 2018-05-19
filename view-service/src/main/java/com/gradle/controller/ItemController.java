package com.gradle.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.gradle.feign.ItemClient;
import java.util.HashMap;
import org.springframework.http.MediaType;

@RestController
@Component
@RequestMapping("/item")
public class ItemController {
    
    @Autowired
    private ItemClient item;
    
    @RequestMapping(value = "/client")
    public Object hello(){
        return item.hello();
    }
    
    @RequestMapping(value = "/test")
    public Object getData(){
        HashMap<String, Object> response = new HashMap<String, Object>();
        response.put("hello", item.hello());
        response.put("items", item.getData());
        return response;
    }
}
