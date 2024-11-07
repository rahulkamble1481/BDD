package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AddProductClass1Runner {
	
	String productId;
	public String getProductId()
	{
		return productId;
	}
	
	@Given("I should be at the product page")
	public void i_should_be_at_the_product_page() {
		System.out.println("given statement");
	    
	}

	@When("I click on add to cart button")
	public void i_click_on_add_to_cart_button() {
	   System.out.println("product added to cart");
	}

	@Then("product should get add to cart")
	public void product_should_get_add_to_cart() {
	    System.out.println("Product validated");
	    productId="fvhjgfvx";
	}

}
