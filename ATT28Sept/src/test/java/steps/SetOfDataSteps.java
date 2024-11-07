package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SetOfDataSteps {

	
	@Given("user is at signup page")
	public void user_is_at_signup_page() {
		System.out.println("Signning up........");
	   
	}

	@When("user enters the usernaame as {string} on form")
	public void user_enters_the_usernaame_as_on_form(String string) {
	    System.out.println("Entered name is...."+string);
	}

	@When("user enters the slotNumber as {int}")
	public void user_enters_the_slot_number_as(Integer int1) {
		System.out.println("slot number is...."+int1);
	   
	}

	@When("user select the gender as {string}")
	public void user_select_the_gender_as(String string) {
	    System.out.println("selected gender value is...."+string);
	}

	@Then("user gets created")
	public void user_gets_created() {
		System.out.println("Use created");
	   
	}
	
	
}
