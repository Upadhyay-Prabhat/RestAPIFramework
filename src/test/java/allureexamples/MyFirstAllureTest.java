package allureexamples;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import io.qameta.allure.Issue;
import io.qameta.allure.Link;
import io.qameta.allure.junit4.DisplayName;


public class MyFirstAllureTest {
	
	@Link("https://www.google.com/")
	@DisplayName("First Allure Report Test")
	@Test
	public void tc1(){		
		assertTrue(true);
	}
	
	@Issue("https://www.youtube.com/")
	@DisplayName("Second Allure Report Test")
	@Test
	public void tc2(){
		
		assertTrue(true);
		
	}

}
