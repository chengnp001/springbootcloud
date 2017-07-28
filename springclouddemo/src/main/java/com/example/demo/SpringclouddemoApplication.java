package com.example.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@EnableEurekaServer
@SpringBootApplication
public class SpringclouddemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringclouddemoApplication.class, args);
	}



}
