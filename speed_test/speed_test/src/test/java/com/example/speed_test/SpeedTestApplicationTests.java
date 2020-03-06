package com.example.speed_test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;
import java.util.List;
import java.util.Optional;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;



@SpringBootTest
class SpeedTestApplicationTests {
  
  @Mock
  private SpeedRepository speedRepo;
  
  @Mock
  private SpeedServiceImpl speedServiceImpl;
  
  @InjectMocks
  private SpeedService speedService = new SpeedServiceImpl();
  
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
	  when(speedRepo.findById((long) 1)).thenReturn(Optional.of(testSpeedResult));

	    assertEquals(testSpeedResult, speedService.findById(1));
	  
	}
	
	 @Test
	  public void speedCreate() {
	    when(speedRepo.save(testSpeedResult)).thenReturn(testSpeedResult);

	    assertEquals(testSpeedResult, speedService.create(testSpeedResult));
	  }

}
