package implementation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class HomePage extends PageBase
{
	public HomePage(WebDriver driver) 
	{
		super(driver);
		
	}

	@FindBy(className = "login")
    WebElement signInBtn;
	
	WebDriverWait wait;
	
	@SuppressWarnings("deprecation")
	public void OpenRegistrationPage(WebDriver driver)
	{	
		wait = new WebDriverWait(driver, 20);
		Assert.assertEquals(driver.getTitle(), "My Store");
		wait.until(ExpectedConditions.elementToBeClickable(By.className("login")));
		System.out.println("open registration page");
		clickButton(signInBtn);
	}
}
