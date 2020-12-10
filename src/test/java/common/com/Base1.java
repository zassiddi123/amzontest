package common.com;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base1 {

	public WebDriver driver;
	
	public WebElement getDriver() {
	
	System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver");
	 driver=new ChromeDriver();
	 
	driver.get("https://www.amazon.com/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	return null;
	
	}
	
}
