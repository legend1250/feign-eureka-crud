/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gradle;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 *
 * @author mark.intern
 */
@Configuration
@EnableWebMvc
public class WebConfig extends WebMvcConfigurerAdapter {

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
//        registry.addResourceHandler(
//                "/service-worker.js",
//                "/static/css/**",
//                "/static/js/**",
//                "/static/media/**")
//                .addResourceLocations(
//                        "classpath:/templates/service-worker.js",
//                        "classpath:/templates/static/css/",
//                        "classpath:/templates/static/js/",
//                        "classpath:/templates/static/media/");
        registry.addResourceHandler(
                "/**")
                .addResourceLocations(
                        "classpath:/templates/");
    }

}