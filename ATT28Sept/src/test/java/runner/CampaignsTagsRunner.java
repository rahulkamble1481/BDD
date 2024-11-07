package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features= {"src\\test\\resources\\appfeature\\CampaignTags.feature"},
		glue={"steps","Hooks"},
		plugin= {"pretty"},
		//tags="@regression or @functional")
		//tags="@functional and @regression")
		//tags="not @functional")
	//tags="not @functional or @sanity")
		//tags="@campaigns")
		tags="@sanity")
public class CampaignsTagsRunner extends AbstractTestNGCucumberTests  {

}
