package com.example.aggregatedservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SpeedController {
  
  @Autowired
  SpeedsFeign speedsFeign;
  
  @Autowired 
  ConvertFeign convertFeign;
  
  @PostMapping("/api/experiment")
  public Object saveSpeed() {
    return speedsFeign.postSpeed();
    
  }
  
  @RequestMapping(method= RequestMethod.GET, value= "api/convert/{from}/to/{to}")
  public Double convert (@RequestParam Double unit, @PathVariable String from, @PathVariable String to) {
    return convertFeign.convert(unit, from, to);
  }  
  
  @GetMapping("/api")
  public Double test() {
    return convertFeign.convert(5.0, "centimeters", "meters");
  }
  
  @GetMapping("/api/exeriment?subjectName=\"Drop Tennis Ball\"&convertTo=\"Feet\"")
  public Long getSpeed() {
    return speedsFeign.getSpeed();
    
  }
  

}
