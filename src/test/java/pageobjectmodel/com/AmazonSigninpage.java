package pageobjectmodel.com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AmazonSigninpage {

	
	public WebDriver driver;
	
	public AmazonSigninpage(WebDriver driver) {

		this.driver=driver;
		PageFactory.initElements(driver, this);	
}
	
@FindBy(xpath="//a[@id='nav-link-accountList']")
public WebElement signin;
public void getsignin() {
	signin.click();
}
	
@FindBy(xpath="//input[@id='ap_email']")
public WebElement enteremail;
public void getemail() {
	enteremail.sendKeys("its_zas90@yahoo.com");
	
}	
	
@FindBy(xpath="//input[@id='continue']")
public WebElement enter;
public void getenter() {
	enter.click();
}	
@FindBy(xpath="//input[@id='ap_password']")	
	public WebElement enterpassword;
public void getpassword() {
	enterpassword.sendKeys("siddiwww90");
}

@FindBy(xpath="//input[@id='signInSubmit']")
public WebElement clicksignin;
public void getsign() {
      clicksignin.click();
}

}