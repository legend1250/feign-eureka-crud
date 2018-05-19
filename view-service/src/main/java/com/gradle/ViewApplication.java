package com.gradle;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
@Controller
public class ViewApplication {
    
    public static void main(String[] args) {
            SpringApplication.run(ViewApplication.class, args);
    }
    
    @GetMapping(path = {"/", "/**/{path:[^\\.]*}"}, produces = MediaType.TEXT_HTML_VALUE)
    public String index(ModelMap map) {
        return "index";
    }
}
