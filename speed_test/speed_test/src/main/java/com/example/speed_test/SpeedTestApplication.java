package com.example.speed_test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
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
	
	@Autowired
	  SpeedService speedService;
	  
	  @PostMapping("/api/experiment")
	  public SpeedResult saveSpeed() {
	    SpeedResult newSpeed = new SpeedResult();
	    return speedService.create(newSpeed);
	  }
	  
	  @GetMapping("/api/exeriment?subjectName=\"Drop Tennis Ball\"&convertTo=\"Feet\"")
	  public SpeedResult getSpeed() {    
	    SpeedResult getSpeed = new SpeedResult();
	    Long speedId = getSpeed.getId();
	    return speedService.findById(speedId);
	    
	  }
	  

}
