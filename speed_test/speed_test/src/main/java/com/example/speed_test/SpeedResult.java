package com.example.speed_test;

import java.sql.Timestamp;
import java.time.Duration;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Transient;

@Entity
public class SpeedResult {
  
  @Id
  private Long id;
  
  @Column
  private String subjectName;
  
  @Embedded
  private Speed speed;
  
  @Column
  private Timestamp experimentTime;  

  public SpeedResult() {
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
  
  @Column
  private Duration duration;  

  @Embedded
  private Distance distance;

  public Duration getDuration() {
    return duration;
  }

  public void setDuration(Duration duration) {
    this.duration = duration;
  }

  public Distance getDistance() {
    return distance;
  }

  public void setDistance(Distance distance) {
    this.distance = distance;
  }

  public Speed() {
    super();
  }
  
  
  
}

class Distance{
  @Column
  private DistanceUnit distanceUnit;
  @Column
  private Double unit;
  public DistanceUnit getDistanceUnit() {
    return distanceUnit;
  }
  public void setDistanceUnit(DistanceUnit distanceUnit) {
    this.distanceUnit = distanceUnit;
  }
  public Double getUnit() {
    return unit;
  }
  public void setUnit(Double unit) {
    this.unit = unit;
  }
  public Distance() {
    super();
  }
  
  
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
