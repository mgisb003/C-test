package com.example.speed_test;

import static org.assertj.core.api.Assertions.assertThat;
import java.util.List;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;



@SpringBootTest
class SpeedTestApplicationTests {
  
  @Autowired
  private SpeedService speedService;
  
  static SpeedResult testSpeedResult;
  
  static List<SpeedResult> testSpeedResultReturnList;
  
  static {
    testSpeedResult = new SpeedResult();
    testSpeedResult.setId((long) 1);
    testSpeedResult.setSubjectName("Test 1");
  }

	@Test
	void contextLoads() {
	}
	
	  /**
	   * Test of findById
	   */
	@Test
	public void speedResultFindByIdTest() {
	  SpeedResult sr = new SpeedResult();
	  sr.setId((long)1);
	  sr.setSubjectName("test 1");
	  
	 // assertThat(sr, speedService.findById(1));
	 // assertThat(speedService.findById(1)).isNotNull();
	  assertThat(speedService.findById(1)).equals(sr);
	  
	  
	  
	}

}
