/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gradle.feign;

import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import static org.springframework.web.bind.annotation.RequestMethod.GET;

/**
 *
 * @author Vinh
 */
@EnableFeignClients
@FeignClient("user-service")
public interface UserClient {
    @RequestMapping(value = "/users/client", method = GET)
    String hello();
    @RequestMapping(value = "/users/get-all", method = GET)
    Object getData();
}
