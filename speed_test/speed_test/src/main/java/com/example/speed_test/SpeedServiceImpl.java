package com.example.speed_test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SpeedServiceImpl implements SpeedService{
 
  @Autowired
  private SpeedRepository speedRepo;

  @Override
  public SpeedResult findById(long id) {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public SpeedResult create(SpeedResult sp) {
    // TODO Auto-generated method stub
    return null;
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
