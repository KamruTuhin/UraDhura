package seleniumPackage1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class elementOne {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Tuhin\\Desktop\\libraries\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		
		driver.manage().deleteAllCookies();
		
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		//driver.get("https://login.yahoo.com/account/create");
		
		driver.navigate().to("https://login.yahoo.com/account/create");
		
		WebElement firstname = driver.findElement(By.name("firstName"));
		
		firstname.sendKeys("mike");
		
		Thread.sleep(2000);
		
		firstname.clear();
		
		//driver.findElement(By.name("firstName")).sendKeys("Mike");
		Thread.sleep(1000);
		WebElement lastName= driver.findElement(By.id("usernamereg-lastName"));
				
		lastName.sendKeys("pence");
		Thread.sleep(1000);
		WebElement username = driver.findElement(By.name("yid")); 
		
		username.sendKeys("jarifur.rahman");
		Thread.sleep(1000);
		WebElement password = driver.findElement(By.xpath("//*[@id=\"usernamereg-password\"]"));
		
		password.sendKeys("horiloot");  
		
		Thread.sleep(1000);
		WebElement help = driver.findElement(By.linkText("Help")); 
		
		help.click();
		
		
		//driver.findElement(By.id("usernamereg-lastName")).sendKeys("pence");
		
		//driver.findElement(By.name("yid")).sendKeys("jarifur.rahman");
		
		//driver.findElement(By.xpath("//*[@id=\"usernamereg-password\"]")).sendKeys("horiloot");
		
		Thread.sleep(2000);

	}

	private static WebElement sendKeys(String string) {
		// TODO Auto-generated method stub
		return null;
	}

}
