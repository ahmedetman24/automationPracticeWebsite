package implementation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;


public class SummaryPage extends PageBase
{
	public SummaryPage(WebDriver driver) {
		super(driver);
	}

	WebDriverWait wait;

	@SuppressWarnings("deprecation")
	public void chooseResultBlouse(WebDriver driver) throws InterruptedException
	{  
		//check the page title
		wait = new WebDriverWait(driver, 20);
		Assert.assertEquals(driver.getTitle(), "Order - My Store");
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div/div[2]/div/div[3]/div/p[2]/a[1]")));

		// Proceed to checkout
		WebElement proceedToCheckoutBtn = driver.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div/p[2]/a[1]"));
		proceedToCheckoutBtn.click();
		System.out.println("Go to Address tab");
		
		//Address tab
		wait.until(ExpectedConditions.elementToBeClickable(By.name("processAddress")));
		WebElement proceedToCheckoutBtn2 = driver.findElement(By.name("processAddress"));
		proceedToCheckoutBtn2.click();
		System.out.println("Go to Shipping tab");
		
		//Shipping tab
		wait.until(ExpectedConditions.elementToBeClickable(By.name("processCarrier")));
		WebElement agreeCheckBox = driver.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div/div/form/div/p[2]/div/span/input"));
		agreeCheckBox.click();
		
		WebElement proceedToCheckoutBtn3 = driver.findElement(By.name("processCarrier"));
		proceedToCheckoutBtn3.click();
		System.out.println("Go to Payment tab");
		
		//Payment tab
		wait.until(ExpectedConditions.elementToBeClickable(By.className("bankwire")));
		WebElement bankWireHyperlink = driver.findElement(By.className("bankwire"));
		bankWireHyperlink.click();
		System.out.println("Go to Confirm Order");
		
		//Confirm order
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div/div[2]/div/div[3]/div/form/p/button")));
		WebElement confirmOrderBtn = driver.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div/form/p/button"));
		confirmOrderBtn.click();
		System.out.println("Order completed");
		
		//Order history
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div/div[2]/div/div[3]/div/p/a")));
		WebElement backToOrdersBtn = driver.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div/p/a"));
		backToOrdersBtn.click();
		System.out.println("Go to Order history");
		
		//Check History
		wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("/html/body/div/div[2]/div/div[3]/div/div/table/tbody/tr/td[1]/a")));
		WebElement orderHyperlink = driver.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div/div/table/tbody/tr/td[1]/a"));
		orderHyperlink.click();
		System.out.println("Process Completed");
		Thread.sleep(3000);
		
		//Logout
		wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("/html/body/div/div[1]/header/div[2]/div/div/nav/div[2]/a")));
		WebElement signOutHyperlink = driver.findElement(By.xpath("/html/body/div/div[1]/header/div[2]/div/div/nav/div[2]/a"));
		signOutHyperlink.click();
		System.out.println("Log out");
		
		//Return to Home Page
		driver.navigate().to("http://automationpractice.com/index.php");
	}
}

