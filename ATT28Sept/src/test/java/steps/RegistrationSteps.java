package steps;

import java.util.List;
import java.util.Map;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.datatable.DataTable;

public class RegistrationSteps {
	
	@Given("User is at account page")
	public void user_is_at_account_page() {
	   System.out.println("given for account openning");
	}

	@When("user enters the following data")
	public void user_enters_the_following_data(DataTable dataTable) {
	   List<List<String>> data = dataTable.asLists();
	  List<String> data1 = data.get(0);
	String firstname = data1.get(0);
	  System.out.println(data1);
	  
	  for(String elements:data1) {
		  System.out.println(elements);
	  }
	//System.out.println(firstname);
	//System.out.println(data.get(1).get(2));;
	System.out.println("******************************");
	List<Map<String, String>> mapdata = dataTable.asMaps();
	Map<String, String> mapdata1 = mapdata.get(1);
	String emailValue=mapdata1.get("email");
	String emailAtZerothIndex=mapdata.get(0).get("email");
	System.out.println(emailValue);
	}

	@When("user clicks on submit button")
	public void user_clicks_on_submit_button() {
	    System.out.println("submitting the details"); 
	}

	@Then("Aapplication should get submitted")
	public void aapplication_should_get_submitted() {
		System.out.println("Application submitted");
	   
	}

}
