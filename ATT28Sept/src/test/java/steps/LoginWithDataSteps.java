package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginWithDataSteps {

	@Given("user should be at login page")
	public void user_should_be_at_login_page() {
	    System.out.println("navigating to login page");
	}

	@When("user enters usename as {string}")
	public void user_enters_usename_as(String uname) {
	   System.out.println("entering usename as"+uname);
	}

	@When("user enters password as {string}")
	public void user_enters_password_as(String password) {
	   System.out.println("entering password as"+password); 
	}

	@When("user click on submit button")
	public void user_click_on_submit_button() {
	  System.out.println("clicked on submit button");  
	}

	@Then("user should get logged into application")
	public void user_should_get_logged_into_application() {
	    System.out.println("login validated");
	}
	
}
