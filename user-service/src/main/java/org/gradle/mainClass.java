package org.gradle;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.gradle.controller.IndexController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
@Controller
public class mainClass {
    private Log LOG = LogFactory.getLog(IndexController.class);
    
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String index(ModelMap map) {
        return "index";
    }
    
     public static void main(String[] args) throws Exception {
        SpringApplication.run(mainClass.class);
    }
}
