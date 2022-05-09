package seleniumPackage1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClassWork {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver","C:\\Users\\Tuhin\\Desktop\\libraries\\chromedriver.exe");
	 	
		WebDriver driver = new ChromeDriver();
		
		WebDriver driver1 = new ChromeDriver();
		
		 
		driver.get("https://login.yahoo.com/account/create");
		
		Thread.sleep(2000);
		
		driver1.get("https://twitter.com/");
		
		Thread.sleep(3000);
		
		driver.quit();
		



	}

}
