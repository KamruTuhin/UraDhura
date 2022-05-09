package seleniumPackage1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class elementInteraction {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Tuhin\\Desktop\\libraries\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		
		driver.manage().deleteAllCookies();
		
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		//driver.get("https://login.yahoo.com/account/create");
		
		driver.navigate().to("https://login.yahoo.com/account/create");
		
		driver.findElement(By.name("firstName")).sendKeys("Mike");
		
		driver.findElement(By.id("usernamereg-lastName")).sendKeys("pence");
		
		driver.findElement(By.name("yid")).sendKeys("jarifur.rahman");
		
		driver.findElement(By.xpath("//*[@id=\"usernamereg-password\"]")).sendKeys("horiloot");
		
		Thread.sleep(2000);
		

	}

}
