//package com.example.speed_test;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//@RestController
//public class SpeedRepoController {
//  
//  @Autowired
//  SpeedService speedService;
//  
//  @PostMapping("/api/experiment")
//  public SpeedResult saveSpeed() {
//    SpeedResult newSpeed = new SpeedResult();
//    return speedService.create(newSpeed);
//  }
//  
//  @GetMapping("/api/exeriment?subjectName=\"Drop Tennis Ball\"&convertTo=\"Feet\"")
//  public SpeedResult getSpeed() {    
//    SpeedResult getSpeed = new SpeedResult();
//    Long speedId = getSpeed.getId();
//    return speedService.findById(speedId);
//    
//  }
//  
//
//}
