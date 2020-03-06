package com.example.speed_test;

import org.springframework.stereotype.Service;

@Service
public interface SpeedService {
  
  /***
   * "findById" finds the SpeedResult by Id
   * 
   * @param id
   * @return
   */
  SpeedResult findById(long id);
  
  SpeedResult create(SpeedResult sp);
  
  SpeedResult update(long id);
  
  SpeedResult delete(long id);

}
