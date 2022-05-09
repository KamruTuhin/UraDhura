package sauseDemoTest;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class basicNG {
	
	@BeforeTest
	public void setupTest() {
	
	System.out.println("This is before test");	
		
	}
	
	
	@Test(priority=1) //, enabled=false)
	public void loginTest(){
			
		Reporter.log("this is login test");
		Assert.assertEquals("test", "test");
		System.out.println("This is the main test");
		
	}
	
	@Test(priority=2)
	public void SignupTest(){
		Reporter.log("this is signup test");
		Assert.assertEquals("test","test");
	System.out.println("This is main or signup test");
	}
	
	
	@AfterTest
	public void endTest() {
		System.out.println("This is after test");
		
	}

}
