package com.example.aggregatedservice;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@FeignClient(name = "speedtest")
public interface SpeedsFeign {
  
    @GetMapping("/api/exeriment?subjectName=\"Drop Tennis Ball\"&convertTo=\"Feet\"")
    public Long getSpeed();
    
    @PostMapping("/api/experiment")
    public Object postSpeed();

  }


