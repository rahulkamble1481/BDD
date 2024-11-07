package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ProfileSteps {
	@Given("I have logged into the application")
	public void loggedIntoApp()
	{
		System.out.println("login to application");
	}
	@Given("I am at homepage")
	public void navToHomePage()
	{
		System.out.println("navigated to homepage");
	}
	@When("I clicked on add button")
	public void addprofile()
	{
		System.out.println("addtion of profile");
	}
	@When("I entered the data")
	public void enteringData()
	{
		System.out.println("data added");
	}
	@Then("profile should get added")
	public void profileValidated()
	{
		System.out.println("Add profile validation");
	}
	@When("i click on edit button")
	public void editProfile()
	{
		System.out.println("updation of profile");
	}
	@When("i update the data")
	public void updatingData()
	{
		System.out.println("data updated");
	}
	@Then("profile should get update")
	public void profileUpdateValidation()
	{
		System.out.println("update profile validataion");
	}
	@When("I clicked on delete button")
	public void hitDeleteButton()
	{
		System.out.println("profile Deleted");
	}
	@Then("profile Should get delete")
	public void profileDeletionValidation()
	{
		System.out.println("profile deleted validated");
	}
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		


}
