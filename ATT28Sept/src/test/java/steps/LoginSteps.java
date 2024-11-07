package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {
	@Given("I am at the login page")
	public void goToLoginPage()
	{
		System.out.println("I am at login page");
	}	
	@When("I entered the credentials")
	public void enterCredentials()
	{
		System.out.println("Credentials has been entered");
		
	}
	@When("I clicked on login button")
	public void clickOnLogin()
	{
		System.out.println("clicked on login button");
	}
	@Then("I should be able to login")
	public void validateLogin()
	{
		System.out.println("login validatetd");
	}
	
	@Given("I am at landing page")
	public void navToLandingPage()
	{
		System.out.println("navigate to landing paage");
	}
	@Then("title should get validated")
	public void validateTitle()
	{
		System.out.println("title validated");
	}
		
	}

	


