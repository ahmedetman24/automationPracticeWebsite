package implementation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;


public class BlousesResultPage extends PageBase
{
	public BlousesResultPage(WebDriver driver) {
		super(driver);
	}

	WebDriverWait wait;

	@SuppressWarnings("deprecation")
	public void chooseResultBlouse(WebDriver driver)
	{  
		//check the page title
		wait = new WebDriverWait(driver, 20);
		Assert.assertEquals(driver.getTitle(), "Blouses - My Store");
		wait.until(ExpectedConditions.elementToBeClickable(By.className("product_img_link")));  

		// select the result blouse
		WebElement blouseResult = driver.findElement(By.className("product_img_link"));
		blouseResult.click();
		System.out.println("img clicked, go to show product page");
	}
}
