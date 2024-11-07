package steps;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AddProductClass2Runner {
	
	AddProductClass1Runner addingProduct1;
	public AddProductClass2Runner(AddProductClass1Runner ap1) {
		addingProduct1=ap1;
	}

	@When("I click on place order")
	public void i_click_on_place_order() {
	    System.out.println("placing the order");
	}

	@Then("Order should get placed")
	public void order_should_get_placed() {
	   System.out.println("Order placed validation");
	  String prdId= addingProduct1.getProductId();
	  System.out.println(prdId);
	}
}
