package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features= {"src\\test\\resources\\appfeature\\OrderHooks.feature"},
		glue={"steps"},
		plugin={"pretty"}
		)

public class OrderHooksRunner extends AbstractTestNGCucumberTests {

}
