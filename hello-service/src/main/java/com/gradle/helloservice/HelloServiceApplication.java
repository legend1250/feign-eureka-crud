package com.gradle.helloservice;

import com.gradle.model.AccountDTO;
import com.gradle.model.UserDTO;
import java.util.HashMap;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableDiscoveryClient
@RestController
public class HelloServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(HelloServiceApplication.class, args);
	}
        
        @Autowired
	DiscoveryClient client;

	@RequestMapping("/")
	public String index() {
		List<ServiceInstance> localInstance = client.getInstances("hello-service");
		return "Hello World 2: "+ localInstance.get(0).getServiceId()+":"+localInstance.get(0).getHost()+":"+localInstance.get(0).getPort();
	}
        
        @RequestMapping("/getdata")
	public Object hello() {
            UserDTO user = new UserDTO(1, "Vinh");
            HashMap<String, Object> response = new HashMap<String, Object>();
            response.put("user1", user);
            response.put("status", true);
            response.put("status2", true);
            
            return response;
	}
}
