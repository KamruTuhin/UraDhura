package seleniumPackage1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class helpPageMenuValidate {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Tuhin\\Desktop\\libraries\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		

		driver.manage().deleteAllCookies();
		
		driver.manage().window().maximize();
		
		driver.get("https://help.yahoo.com/kb/account");
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		WebElement passwordSignIn = driver.findElement(By.xpath("//*[@id=\"pltpcs\"]/ul/li[2]/a"));
		
		boolean passwordDisplay = passwordSignIn.isDisplayed(); 
		
		System.out.println(passwordDisplay);
		
		String passwordText = passwordSignIn.getText();
		System.out.println(passwordText);
		
		
		

	}

}
