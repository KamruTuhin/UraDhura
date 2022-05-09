package selenium;

public class fireFoxDriver implements WeDriver{

	@Override
	public void findElement() {
		System.out.println("findelement in firefoxDriver");
		
	}

	@Override
	public void sendKeys() {
		System.out.println("sendKeys in fireFoxDriver");
		
	}

	@Override
	public void click() {
		System.out.println("click in fireFoxDriver");
		
	}

}
