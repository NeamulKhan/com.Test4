package stepDefinationTest4;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utilityTest4.BaseClassTest4;

public class LoginTest4 extends BaseClassTest4{
	
	@Given("launch {string}")
	public void launch(String URL) {
	  
		test4launchURL(URL);
		
	}

	@When("user validate the home page title")
	public void user_validate_the_home_page_title() {
	   
		
	}
	
	@When("click login link")
	public void click_login_link() {
	    
		
	}

	@Then("user entered {string}, {string} and click login button")
	public void user_entered_and_click_login_button(String string, String string2) {
	   
		
	}

	@Then("verify user successfully logged in")
	public void verify_user_successfully_logged_in() {
	   
		
	}

}
