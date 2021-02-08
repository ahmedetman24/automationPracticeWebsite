package implementation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;


public class ShowProductPage extends PageBase
{
	public ShowProductPage(WebDriver driver) {
		super(driver);
	}

	WebDriverWait wait;

	@SuppressWarnings("deprecation")
	public void chooseResultBlouse(WebDriver driver)
	{  
		//check the page title
		wait = new WebDriverWait(driver, 20);
		Assert.assertEquals(driver.getTitle(), "Blouse - My Store");
		wait.until(ExpectedConditions.elementToBeClickable(By.id("color_8")));

		// select the medium size
		WebElement size = driver.findElement(By.id("group_1"));
		selectDropDown(size, "2");
		
		// select the white color
		WebElement color = driver.findElement(By.id("color_8"));
		color.click();

		// Add to cart
		//Thread.sleep(3000);
		WebElement addToCartBtn = driver.findElement(By.name("Submit"));
		addToCartBtn.click();
		System.out.println("get the popup window");

		// Proceed to checkout
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div/div[1]/header/div[3]/div/div/div[4]/div[1]/div[2]/div[4]/a")));
		WebElement proceedToCheckoutBtn = driver.findElement(By.xpath("/html/body/div/div[1]/header/div[3]/div/div/div[4]/div[1]/div[2]/div[4]/a"));
		proceedToCheckoutBtn.click();
		System.out.println("Go to Summary page");		
		}
}
