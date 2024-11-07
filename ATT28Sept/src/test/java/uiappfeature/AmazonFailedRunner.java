package uiappfeature;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		
		features = {"@target/failedrun.txt"},
		glue = {"uiappfeature"},
		plugin = {"pretty","html:target/amazontestreport/report.html",
		"rerun:target/failedrun.txt"},
		publish = true
	)

public class AmazonFailedRunner extends AbstractTestNGCucumberTests {

}
