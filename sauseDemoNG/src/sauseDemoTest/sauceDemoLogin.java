package sauseDemoTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class sauceDemoLogin<loginPage> {
	
	WebDriver driver;
	loginPage lp;
	
	
	@BeforeTest
	public void setupTest() {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Tuhin\\Desktop\\libraries\\chromedriver.exe");
		
	driver= new ChromeDriver();
		
	
	driver.get("https://www.saucedemo.com/");
	driver.manage().timeouts().implicitlyWait(2000, arg1)
	
	
	}

	@AfterTest
	public void endTest() {
		driver.quit();
		
	}
	@Parameters({"username","password"})
	@Test
	public void dataloginValidation(String username,String password) throws InterruptedException {
	
		WebElement usernametextbox = driver.findElement(By.id("user-name"));
		
		WebElement passwordtextbox = driver.findElement(By.id("password"));
		
		WebElement login = driver.findElement(By.id("login-button"));	
		
		Thread.sleep(2000);
		usernametextbox.sendKeys("standard_user");
		passwordtextbox.sendKeys("secret_sauce");
		login.click();
		
		String actualResult=driver.getCurrentUrl();
		String expectedResult="https://www.saucedemo.com/inventory.html";
		
		Assert.assertEquals("expectedResult", "actualResult");

		//System.out.println(username);
		//System.out.println(password);
		
	}
}
