package uiappfeature;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		
		features = {"src\\test\\resources\\uiappfeature\\HomePage.feature"},
		glue = {"uiappfeature"},
		plugin = {"pretty","html:target/amazontestreport/report.html",
		"rerun:target/failedrun.txt"},
		publish = true
	)

public class AmazonTestRunner extends AbstractTestNGCucumberTests {
	
	

}
