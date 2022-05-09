package testngAnik;

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
		System.out.println("This is main test");	
		Reporter.log("This is login test");
		Assert.assertEquals("test", "test");
		System.out.println("This is the main test");
		
	}
	
	@Test(priority=2)
	public void SignupTest(){
	Reporter.log("this is signup test");	
	System.out.println("This is main test");
	}
	
	
	@AfterTest
	public void endTest() {
		System.out.println("This is after test");
		
	}

}
