package codepractice.com;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragandDrop {
public static void main(String[] args) {
	
	System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver");
	WebDriver driver=new ChromeDriver();
	 
	driver.get("https://jqueryui.com");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	
	driver.findElement(By.xpath("//a[contains(text(),'Droppable')]")).click();
	
	driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='demo-frame']")));
	
	WebElement drag= driver.findElement(By.xpath("//div[@id='draggable']"));
	
	WebElement drop= driver.findElement(By.xpath("//div[@id='droppable']"));
	
	Actions ac= new Actions(driver);
	ac.dragAndDrop(drag, drop).build().perform();
	
}
}
