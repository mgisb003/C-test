package com.example.speed_test;

import static org.junit.Assert.assertEquals;
import java.util.List;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;



@SpringBootTest
class SpeedTestApplicationTests {
  
  @Mock
  private SpeedService speedService;
  
  static SpeedResult testSpeedResult;
  
  static List<SpeedResult> testSpeedResultReturnList;
  
  static {
    testSpeedResult = new SpeedResult(1);
//    testSpeedResult.setId((long) 1);
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
//	  SpeedResult sr = new SpeedResult();
//	  sr.setId((long)1);
//	  sr.setSubjectName("test 1");
	  
	 // assertThat(sr, speedService.findById(1));
	 // assertThat(speedService.findById(1)).isNotNull();
	  assertEquals(testSpeedResult.getId(), speedService.findById(1));
	  
	  
	  
	}

}
