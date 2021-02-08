package implementation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends PageBase 
{

	public LoginPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(id="email_create")
	WebElement regMail;
	
	public void enterEmail (String email)
	{
		regMail.sendKeys(email);
		regMail.submit();
	}
	

}
