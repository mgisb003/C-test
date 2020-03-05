package com.example.aggregatedservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SpeedController {
  
  @Autowired
  SpeedsFeign speedsFeign;
  
  @PostMapping("/api/experiment")
  
  
  @GetMapping("/api")
  public String getSpeed() {
    return speedsFeign.getSpeed()+ "FROM Aggregated-service_aggregated-service";
  }
  

}
