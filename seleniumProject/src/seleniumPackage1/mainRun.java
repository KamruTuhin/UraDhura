package seleniumPackage1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class mainRun {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Tuhin\\Desktop\\libraries\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://login.yahoo.com/account/create");

		Thread.sleep(2000);
		
		String title = driver.getTitle();
		
		System.out.println(title);
		
		String url=driver.getCurrentUrl();
		
		System.out.println(url);
		
		driver.quit();
	}

}
