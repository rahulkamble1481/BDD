package uiappfeature;

import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import qa.DriverFactory;
import utility.PropertyReader;

public class ApplicationHooks {
	WebDriver driver;
	
	@Before
	public void openBrowser() throws IOException
	{
		DriverFactory df = new DriverFactory();
		
		String browserName = PropertyReader.readPropData("browsername");
			
		String browserFromCommandPrompt = System.getProperty("cliBrowser");
		
		String envValue = System.getProperty("env");
		
		System.out.println(envValue);
		
		if(browserFromCommandPrompt !=null)
		{
			browserName = browserFromCommandPrompt;
		}
		
		  driver = df.initBrowser(browserName);
		 
		 driver.manage().window().maximize();
		 
	}
	
	
	@After(order = 1)
	public void shutdown()
	{
		driver.quit();
		
	}
	
	
	@After(order = 2)
	public void tearDown(Scenario scenario)
	{
		boolean scenarioStatus = scenario.isFailed();
		
		if(scenarioStatus)
		{
			String scenarioName = scenario.getName();
			
			String scenarioUpdatedName = scenarioName.replaceAll(" " , "_");
			
			TakesScreenshot ts = (TakesScreenshot)driver;
			
			byte[] source = ts.getScreenshotAs(OutputType.BYTES);
			
			scenario.attach(source, "image/png", scenarioUpdatedName);
			
		}
	}
	

}