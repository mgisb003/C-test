package com.example.speed_test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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
	  
	  @PostMapping("/api/experiment/{id}/{subjectName}")
	  public SpeedResult saveSpeed(@PathVariable Long id,@PathVariable String subjectName) {
	    SpeedResult newSpeed = new SpeedResult();
	    newSpeed.setId(id);
	    newSpeed.setSubjectName(subjectName);
	    return speedService.create(newSpeed);
	  }
	  
	  @GetMapping("/api/{id}")
	  public SpeedResult getSpeed(@PathVariable Long id) {    
	    SpeedResult getSpeed = new SpeedResult();
	    return speedService.findById(getSpeed.getId((Long) id));
	    
	  }
	  

}
