package seleniumPackage1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class sauceDemoLoginTwo {

	public static void main(String[] args) throws InterruptedException {
		String usernamevalue ="locked_out_user";
		String passwordValue = "secret_sauce";
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Tuhin\\Desktop\\libraries\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		
		
		driver.manage().deleteAllCookies();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.saucedemo.com/");
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); 
		
		WebElement username = driver.findElement(By.id("user-name"));
		
		WebElement password = driver.findElement(By.id("password"));
		
		WebElement login = driver.findElement(By.id("login-button"));
		
		Thread.sleep(1000);
		username.sendKeys(usernamevalue);
		password.sendKeys(passwordValue);
		Thread.sleep(1000);
		login.click();
		Thread.sleep(1000);
		String url = driver.getCurrentUrl();
		String title = driver.getTitle();
		
		System.out.println(url); 
		System.out.println(title); 
		
		driver.quit(); 

	}

}
