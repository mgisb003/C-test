package com.example.aggregatedservice;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "speedsFeign")
public interface SpeedsFeign {
  
    @GetMapping("/exeriment?subjectNameDrop Tennis Ball&convertTo=Feet")
    public String getSpeed();

  }


