package uiappfeature;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.HomePage;
import qa.DriverFactory;

public class HomePageSteps {
	HomePage homePage = new HomePage(DriverFactory.getDriver());
	
	@Given("I am at landing page")
	public void i_am_at_landing_page() {
		WebDriver driver = DriverFactory.getDriver();
		
		driver.get("https://www.amazon.in/");
	}

	@Then("page title should contains {string}")
	public void page_title_should_contains(String string) {
	    
		String title = homePage.fetchTitle();
		
		boolean isPresent = title.contains(string);
		
		Assert.assertEquals(isPresent, true);
		
	}

	@Then("cart icon should get displayed")
	public void cart_icon_should_get_displayed() {
	boolean isDisplayed = homePage.verifyCartIcon();
	
	Assert.assertEquals(isDisplayed, true);
	
		
	}

	@When("I click on toys deals")
	public void i_click_on_toys_deals() {
	    homePage.enteringDealSection();
	}

	@Then("toys deals section should open")
	public void toys_deals_section_should_open() {
	  boolean isDisplaying = homePage.identifyToysSection();
	  
	 Assert.assertEquals(isDisplaying, true);
	   
	   
	}
	
}