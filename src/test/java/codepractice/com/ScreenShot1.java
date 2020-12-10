package codepractice.com;

import java.io.File;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class ScreenShot1 {

	
	public static void screenshot(String s, WebDriver driver) throws Throwable {
	
	TakesScreenshot tc1=(TakesScreenshot)driver;
	
	File f=tc1.getScreenshotAs(OutputType.FILE);
	
	FileUtils.copyFile(f, new File(s+".png"));
	
	
	
	
}
}