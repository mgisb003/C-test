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
  
  
  @GetMapping("/api/exeriment?subjectName=\"Drop Tennis Ball\"&convertTo=\"Feet\"")
  public void getSpeed() {
    
  }
  

}
