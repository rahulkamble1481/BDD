package pages;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage {

	private WebDriver driver;
	@FindBy(xpath = "//*[@id='nav-cart']")
	private WebElement cartIcon;
	
	@FindBy(xpath = "//*[@alt='under499']/parent::a")
	private WebElement dealSection;
	
	@FindBy(xpath = "//*[@id='s-refinements']//*[text()='Toys & Games']")
	private WebElement toysText;
	
	private WebDriverWait wait ;
	
	
	public HomePage(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
		wait = new WebDriverWait(driver, Duration.ofSeconds(60));
	
	}
	
	public String fetchTitle()
	{
	String title = driver.getTitle();
	
	return title;
	
	}
	
	
	public boolean  verifyCartIcon()
	{
		boolean isDisplaying = cartIcon.isDisplayed();
		
		return isDisplaying;
	}
	
	
	public void enteringDealSection()
	{
		wait.until(ExpectedConditions.visibilityOf(dealSection));
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", dealSection);
		
	}
	
public boolean identifyToysSection()
{
	wait.until(ExpectedConditions.visibilityOf(toysText));
	
	boolean isDisplaying = toysText.isDisplayed();
	
	return isDisplaying;
}
	
	
	
	
	
	
}