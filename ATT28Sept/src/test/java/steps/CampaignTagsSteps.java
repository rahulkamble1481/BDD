package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CampaignTagsSteps {


@Given("user should at campaign page")
public void user_should_at_campaign_page() {
    System.out.println("Navigate to campaign");
}

@When("user creates campaign button")
public void user_creates_campaign_button() {
    System.out.println("clicked on campaign");
}

@When("User enters the information")
public void user_enters_the_information() {
    System.out.println("information entered");
}

@Then("campaign should get created")
public void campaign_should_get_created() {
  System.out.println("campaign creaated");
}

@When("user click on edit campaign")
public void user_click_on_edit_campaign() {
    System.out.println("editing the caaampaign");
}

@When("user enter the schedule time")
public void user_enter_the_schedule_time() {
   System.out.println("Defining the time for campaigning");
}

@Then("campaign get scheduled")
public void campaign_get_scheduled() {
  System.out.println("campaign scheduled");
}

@When("use click on sent campaign")
public void use_click_on_sent_campaign() {
   System.out.println("Navigate to sent campaign");
}

@Then("user should see the count of email triggered")
public void user_should_see_the_count_of_email_triggered() {
   System.out.println("validate the result"); 
}
}
