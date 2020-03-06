package com.example.aggregatedservice;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name="distanceunit-repository")
public interface ConvertFeign {
  
  @RequestMapping(method= RequestMethod.GET, value= "api/convert/{from}/to/{to}")
  public Double convert (@RequestParam Double unit, @PathVariable String from, @PathVariable String to);

}
