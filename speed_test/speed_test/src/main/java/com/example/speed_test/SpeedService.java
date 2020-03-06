package com.example.speed_test;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Service
public interface SpeedService {
  
  /***
   * "findById" finds the SpeedResult by Id
   * 
   * @param i
   * @return
   */
  SpeedResult findById(long id);
  
  SpeedResult create(SpeedResult sp);
  
  SpeedResult update(long id);
  
  SpeedResult delete(long id);

}
