package testngAnik;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class sauceDemoNG {
	
	WebDriver driver;
	
	@BeforeTest
	public void setupTest() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Tuhin\\Desktop\\libraries\\chromedriver.exe");
		
		 driver= new ChromeDriver();
		
		
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
		
		driver.manage().deleteAllCookies(); 
		
		WebElement username = driver.findElement(By.id("user-name"));
		
		WebElement password = driver.findElement(By.id("password"));
		
		WebElement login = driver.findElement(By.id("login-button"));
		boolean x= username.isDisplayed();
		boolean y=password.isDisplayed();
		boolean z=login.isDisplayed();
		
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
		
	}
		
	@Test(priority=3)
	public void positive_login_Valoidation() {
		WebElement username = driver.findElement(By.id("user-name"));
		
		WebElement password = driver.findElement(By.id("password"));
		
		WebElement login = driver.findElement(By.id("login-button"));	
		
		username.sendKeys("standard_user");
		password.sendKeys("secret_sauce");
		login.click();
		
	}
	
	@Test(priority=2)
	public void negative_login_validation(){
		WebElement username = driver.findElement(By.id("user-name"));
		
		WebElement password = driver.findElement(By.id("password"));
		
		WebElement login = driver.findElement(By.id("login-button"));	
		
		username.sendKeys("wrong_user");
		password.sendKeys("secret_sauce");
		login.click();
		
		
	}
	

}


