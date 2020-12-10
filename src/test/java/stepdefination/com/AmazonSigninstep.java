package stepdefination.com;

import org.openqa.selenium.support.PageFactory;

import common.com.Base1;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageobjectmodel.com.AmazonSigninpage;

public class AmazonSigninstep extends Base1{
	AmazonSigninpage as;
	@Given("^user are on home page$")
	public void user_are_on_home_page() throws Throwable {
	   getDriver();
	   as=PageFactory.initElements(driver, AmazonSigninpage.class);
	    
	}

	@When("^user can click signin button$")
	public void user_can_click_signin_button() throws Throwable {
	   as.getsignin();
	    
	}

	@When("^user can enter email$")
	public void user_can_enter_email() throws Throwable {
	   as.getemail();
	    
	}

	@When("^user can click continue button$")
	public void user_can_click_continue_button() throws Throwable {
	   as.getenter();
	    
	}

	@When("^user can enter password$")
	public void user_can_enter_password() throws Throwable {
	   as.getpassword();
	    
	}

	@When("^user click signin$")
	public void user_click_signin() throws Throwable {
	   as.getsign();
	    
	}

	@Then("^user able to go signin page successfully$")
	public void user_able_to_go_signin_page_successfully() throws Throwable {
	   
	    
	}


}
