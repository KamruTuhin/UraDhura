package learningTestng1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class testNG {
	
	@Test
	public void beforeSuite() throws InterruptedException {
		System.out.println("Before Suite");
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Tuhin\\Desktop\\libraries\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		
		driver.manage().deleteAllCookies();
		
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		
		driver.navigate().to("https://login.yahoo.com/account/create");
		
		WebElement firstname = driver.findElement(By.name("firstName"));
		
		firstname.sendKeys("mike");
		
		Thread.sleep(2000);
		
		firstname.clear();
		
		boolean flag = firstname.isDisplayed();
		
		System.out.println(flag);
		
		WebElement contButton = driver.findElement(By.id("reg-submit-button"));
		
		String X = contButton.getText();
		
		System.out.println(X);
		   
		
		Thread.sleep(1000);
		WebElement help = driver.findElement(By.linkText("Help")); 
		
		boolean flagone = help.isEnabled();
		System.out.println(flagone);
		
		help.click();
		
		driver.quit();
		
	}

}
