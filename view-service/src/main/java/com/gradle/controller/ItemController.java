package com.gradle.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.gradle.feign.ItemClient;
import com.gradle.model.ItemDTO;
import java.util.HashMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import static org.springframework.web.bind.annotation.RequestMethod.POST;

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
    
    @RequestMapping(value = "/insert", method = POST)
    public Object insertOne(@RequestBody ItemDTO itemSubmit){
        return item.insertOne(itemSubmit);
    }
    
    @RequestMapping(value = "/delete/{id}")
    public Object deleteOneById(@PathVariable("id") int id){
        return item.deleteOneById(id);
    }
}
