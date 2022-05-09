package seleniumPackage1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class webTestOne {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Tuhin\\Desktop\\libraries\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		
		driver.manage().deleteAllCookies();
		
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		//driver.get("https://login.yahoo.com/account/create");
		
		driver.navigate().to("https://login.yahoo.com/account/create");
		
		Thread.sleep(2000);
		
		String url=driver.getCurrentUrl();
		
		String title=driver.getTitle();
		
		System.out.println(url);
		
		System.out.println(title);
		
		driver.findElement(By.linkText("Help")).click();
		
		
		
		String url1=driver.getCurrentUrl();
		
		String title1=driver.getTitle();
		
		 System.out.println(url1);
		
		System.out.println(title1);
		
		Thread.sleep(1000);
		
		driver.navigate().back();
		
		Thread.sleep(1000);
		
		driver.navigate().forward();
		
		Thread.sleep(1000);
		
		driver.navigate().refresh();
		
		Thread.sleep(1000);
		
		driver.quit();
		
		
		
		

	}

}
