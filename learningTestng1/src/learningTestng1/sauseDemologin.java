package learningTestng1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class sauseDemologin {
	WebDriver driver;

	@BeforeTest
	public void initializingBrowser() {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Tuhin\\Desktop\\libraries\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.get("https://www.saucedemo.com/");
	}

	@Test(priority = 1)
	public void userName() throws InterruptedException {
	WebElement userNameTextBox = driver.findElement(By.xpath("//*[@id=\"user-name\"]"));
	userNameTextBox.sendKeys("standard_user");
	Thread.sleep(2000);
	}

	@Test(priority = 2)
	public void password() throws InterruptedException {
	WebElement passwordTextBox = driver.findElement(By.xpath("//*[@id=\"password\"]"));
	passwordTextBox.sendKeys("secret_sauce");
	Thread.sleep(2000);
	}

	@Test(priority = 3)
	public void loginButtonClick() throws InterruptedException {
	WebElement loginButton = driver.findElement(By.xpath("//*[@id=\"login-button\"]"));
	loginButton.click();
	Thread.sleep(5000);
	}

	@AfterTest
	public void closingBrowser() {
	driver.quit();
	}

}
