package seleniumPackage1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class seleniumRun {

	public static void main(String[] args) throws InterruptedException {
		//setting up the property
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Tuhin\\Desktop\\libraries\\chromedriver.exe");
		
		//Creating an object of the webdriver/chromedriver class 
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://login.yahoo.com/account/create/");
		
		Thread.sleep(3000);
		
		driver.quit();

	}

}
