package implementation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;


public class AccessBlousesPage extends PageBase
{
	public AccessBlousesPage(WebDriver driver) {
		super(driver);
	}

	
	WebDriverWait wait;

	@SuppressWarnings("deprecation")
	public void chooseBlouse(WebDriver driver)
	{  
		//check the page title
		wait = new WebDriverWait(driver, 20);
		Assert.assertEquals(driver.getTitle(), "My account - My Store");
		wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Women")));
		
		//Browse women list
		moveAndClick(driver, "sf-with-ul", "//*[@id=\"block_top_menu\"]/ul/li[1]/ul/li[1]/ul/li[2]/a");
		System.out.println("Go to BlousesResultPage");
	}
}
