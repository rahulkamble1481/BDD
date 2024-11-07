package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class OrderHooksSteps {
	@Given("user should be logged in")
	public void user_should_be_logged_in() {
	   System.out.println("Given statement"); 
	}

	@When("user clicks on order button")
	public void user_clicks_on_order_button() {
	   System.out.println("clicked on orders");
	}

	@Then("user redirects to orders page")
	public void user_redirects_to_orders_page() {
		System.out.println("Redirection to orders");
	    	}

	@When("user clicks on current order")
	public void user_clicks_on_current_order() {
		System.out.println("clicked on current orders");
	   
	}

	@Then("user should see current order infrmation")
	public void user_should_see_current_order_infrmation() {
	    System.out.println("Current order information fetched");
	}

	@When("user clicks on cancel order")
	public void user_clicks_on_cancel_order() {
	   System.out.println("navigating to cancelled order");
	}

	@Then("user should see cancelled order information")
	public void user_should_see_cancelled_order_information() {
	  System.out.println("cancelled order information fetched");
	}


}
