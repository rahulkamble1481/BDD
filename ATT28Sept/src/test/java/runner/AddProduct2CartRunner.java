package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features= {"src\\test\\resources\\appfeature\\AddProduct2Classes.feature"},
		glue= {"steps"},
		plugin={"pretty"},
        dryRun=true,
        publish=true)

public class AddProduct2CartRunner extends AbstractTestNGCucumberTests {
  
}
