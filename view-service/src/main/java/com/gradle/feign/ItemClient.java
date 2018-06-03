/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gradle.feign;

import com.gradle.model.ItemDTO;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import static org.springframework.web.bind.annotation.RequestMethod.GET;
import static org.springframework.web.bind.annotation.RequestMethod.POST;

/**
 *
 * @author Vinh
 */
@EnableFeignClients
@FeignClient("item-service")
public interface ItemClient {
    @RequestMapping(value = "/items/client", method = GET, consumes = {"text/plain"}, produces = {"text/plain"})
    String hello();
    @RequestMapping(value = "/items/get-all", method = GET)
    Object getData();
    @RequestMapping(value = "/items/insert", method = POST)
    Object insertOne(@RequestBody ItemDTO item);
    @RequestMapping(value = "/items/delete/{id}", method = GET)
    Object deleteOneById(@PathVariable("id") int id);
    
}
