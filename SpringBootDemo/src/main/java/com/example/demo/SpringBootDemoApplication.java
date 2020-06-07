package com.example.demo;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@EnableEurekaServer
public class SpringBootDemoApplication {
	
	
	static Logger log=LoggerFactory.getLogger(SpringBootDemoApplication.class);
	
	@GetMapping("/welcome")
    public String getMessage()
    {
		return "Welcome to Eureka Server";
    }
	
	
	@PostConstruct
	public void init()
	{
		log.info("application started");
	}
	
	
	
	public static void main(String[] args) {
		SpringApplication.run(SpringBootDemoApplication.class, args);
		log.info("Application Executed");
	}

}
