package com.gradle.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@SpringBootApplication
@ComponentScan(basePackages = {"com.gradle"})
@EnableDiscoveryClient
@Configuration
public class HelloServiceApplication {

    public static void main(String[] args) {
            SpringApplication.run(HelloServiceApplication.class, args);
    }
        
}
