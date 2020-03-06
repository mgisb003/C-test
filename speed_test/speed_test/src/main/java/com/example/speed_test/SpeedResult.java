package com.example.speed_test;

import java.sql.Timestamp;
import java.time.Duration;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Transient;

@Entity
public class SpeedResult {
  
  @Id
  private Long id;
  
  @Column
  private String subjectName;
  
  @Transient
  private Speed speed;
  
  @Transient
  private Timestamp experimentTime;
  
  
  

  public SpeedResult(long id2) {
    super();
  }

  public Long getId() {
    return id;
  }
  
  public Long getId(Long id) {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getSubjectName() {
    return subjectName;
  }

  public void setSubjectName(String subjectName) {
    this.subjectName = subjectName;
  }

  public Speed getSpeed() {
    return speed;
  }

  public void setSpeed(Speed speed) {
    this.speed = speed;
  }

  public Timestamp getExperimentTime() {
    return experimentTime;
  }

  public void setExperimentTime(Timestamp experimentTime) {
    this.experimentTime = experimentTime;
  }
  
  
  

}

class Speed{
  private Duration duration;
  private Distance distance;
}

class Distance{
  private DistanceUnit distanceUnit;
  private Double unit;
}

enum DistanceUnit {
  /*
  Millimeters("millimeters"),
  Centimeters("centimeters"),
  Meters("meters"),
  Kilometers("kilometers"),
  Inches("inches"),
  Feet("feet"),
  Yards("yards"),
  Miles("miles");
  */
  
  Millimeters,
  Centimeters,
  Meters,
  Kilometers,
  Inches,
  Feet,
  Yards,
  Miles;
}
