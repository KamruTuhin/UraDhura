package seleniumPackage1;

import java.util.concurrent.TimeUnit;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class sauceDemologin {

	private static final TimeUnit TimeUnit = null;

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Tuhin\\Desktop\\libraries\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		
		
		driver.manage().deleteAllCookies();
		
		driver.manage().window().maximize();
		
		driver.get("https://login.yahoo.com/account/create");
		
		//WebElement firstName = driver.findElement(By )
		
		//Thread.sleep(1000 );
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit); 
		
		//WebElement helplink = driver.findElement(By.linkText("Help"));
		
		
		//helplink.click();
		
		//driver.navigate().back();
		
		//driver.navigate().forward();
		
		//driver.navigate().back();
		
		WebElement firstname = driver.findElement(By.name("firstName"));
		
		firstname.sendKeys("Mike");
		
		
		//WebElement birthMonth = driver.findElement(By.id("usernamereg-month"));
		
		//Select bm = new Select(birthMonth);

		//bm.selectByVisibleText("June");	
		
		
		WebElement birthMonth = driver.findElement(By.id("usernamereg-month"));
		
		Select bm = new Select(birthMonth);

		bm.selectByValue("4");
		
		
		
		WebElement countryCode = driver.findElement(By.name("shortCountryCode"));
		
		Select cc = new Select(countryCode);

		cc.selectByIndex(10);
	}

}
