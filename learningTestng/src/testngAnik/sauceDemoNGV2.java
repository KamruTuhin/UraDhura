package testngAnik;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.loginPage;

public class sauceDemoNGV2 {
	
WebDriver driver;
loginPage lp;
	
		@BeforeTest
		public void setupTest() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Tuhin\\Desktop\\libraries\\chromedriver.exe");
		
		driver= new ChromeDriver();
		
		lp=new loginPage(driver);
		driver.manage().deleteAllCookies();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.saucedemo.com/");	
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); 
		
		
		
		
	}
	
		@AfterTest
		public void endTest() throws InterruptedException {
		
		Thread.sleep(2000);
		driver.quit();
		
	}
		@BeforeMethod
		public void beforeEachTest() {
		
		driver.manage().deleteAllCookies();
		driver.navigate().refresh();
	}
	 
		@Test(priority=1)
		public void loginElementValidation() {
		
		//driver.manage().deleteAllCookies(); 
			
		
		boolean x=lp.getUserName().isDisplayed();
		boolean y=lp.getpassword().isDisplayed();
		boolean z=lp.getloginbutton().isDisplayed();
		
		Assert.assertEquals(x, true);
		Assert.assertTrue(y);
		
		//System.out.println(x);
		//System.out.println(y);
		//System.out.println(z);
		
	}
		
	@Test(priority=3)
	public void positive_login_Valoidation() {
			
		lp.getUserName().sendKeys("standard_user");
		lp.getpassword().sendKeys("secret_sauce");
		lp.getloginbutton().click();
		String expectedurl= "https://www.saucedemo.com/inventory.html";
		String actualUrl = driver.getCurrentUrl();
		
		Assert.assertEquals(actualUrl, expectedurl);
	}
	
	@Test(priority=2)
	public void negative_login_validation(){
		 
		
		lp.getUserName().sendKeys("wrong_user");
		lp.getpassword().sendKeys("secret_sauce");
		lp.getloginbutton().click();
		
		String expectedurl= "https://www.saucedemo.com/";
		String actualUrl = driver.getCurrentUrl();
		
		Assert.assertEquals(actualUrl, expectedurl);
		 

}



}
