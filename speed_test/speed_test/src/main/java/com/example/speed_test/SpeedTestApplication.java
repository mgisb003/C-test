package com.example.speed_test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.RestController;
import com.netflix.discovery.EurekaClient;

@SpringBootApplication
@EnableEurekaClient
@RestController
public class SpeedTestApplication {
  
  @Autowired
  EurekaClient eurekaClient;

	public static void main(String[] args) {
		SpringApplication.run(SpeedTestApplication.class, args);
	}

}
