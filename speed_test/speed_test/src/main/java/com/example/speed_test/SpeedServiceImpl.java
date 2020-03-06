package com.example.speed_test;

import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SpeedServiceImpl implements SpeedService{
  
  @Autowired
  SpeedRepository speedRepository;

  @Override
  public SpeedResult findById(long id) {
    Optional<SpeedResult> response = this.speedRepository.findById(id);    
    return response.get();
  }

  @Override
  public SpeedResult create(SpeedResult sp) {
    return speedRepository.save(sp);
  }

  @Override
  public SpeedResult update(long id) {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public SpeedResult delete(long id) {
    // TODO Auto-generated method stub
    return null;
  }

}
