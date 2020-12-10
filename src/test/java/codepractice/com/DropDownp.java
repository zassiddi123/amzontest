package codepractice.com;



import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownp {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver");
		WebDriver driver=new ChromeDriver();
	
		driver.get("https://www.amazon.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		Select se = new Select(driver.findElement(By.xpath("//select[@class='nav-search-dropdown searchSelect']")));

	se.selectByVisibleText("Baby");
		
		List<WebElement>le=se.getOptions();
		System.out.println(le.size());
		for(int i=0; i<le.size();i++){
		System.out.println(le.get(i).getText());
		
	}

}
}