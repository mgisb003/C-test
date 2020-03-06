package com.example.speed_test;

import java.util.Optional;
import org.springframework.stereotype.Service;
import com.revaturelabs.ask.tag.Tag;

@Service
public class SpeedServiceImpl implements SpeedService{

  @Override
  public SpeedResult findById(long id) {
    SpeedResult newSpeed = new SpeedResult(id);
    return newSpeed;
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
