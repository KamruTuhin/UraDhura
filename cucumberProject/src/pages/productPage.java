package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class productPage {

	WebDriver driver;
	
	public productPage(WebDriver driver) {
		
		this.driver=driver;
		
	}
	
	public WebElement getBackpackCart() {
		
		
			
			WebElement x= driver.findElement(By.Xpath("//*[@id=\"add-to-cart-sauce-labs-backpack\"]"));
			
			return x;
		}
	public WebElement getlightCart() {
		
				
		WebElement x= driver.findElement(By.Xpath("//*[@id=\"add-to-cart-sauce-labs-bike-light\"]"));
		
		return x;
	}
	public WebElement getcheckoutMenu() {
		
		
		WebElement x= driver.findElement(By.Xpath("//*[@id=\"shopping_cart_container\"]/a"));
		
		return x;
	}
	
	public WebElement getcheckoutButton() {
		
		
		WebElement x= driver.findElement(By.Xpath("//*[@id=\"checkout\"]"));
		
		return x;
	}

	}
	
	
}
