package implementation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class PageBase 
{
	protected WebDriver drvier;
	// create constructor 
		public PageBase(WebDriver driver) 
		{
			PageFactory.initElements(driver, this);
			//PageFactory.initElements(driver, this);
		}
		
		
		protected static void clickButton(WebElement button) 
		{
			button.click();
		}
		
		protected static void enterText(WebElement textElement , String value) 
		{
			textElement.clear();
			textElement.sendKeys(value);
		}
		
		protected static void selectDropDown (WebElement list, String selectedOption)
		{
			Select dropDownList = new Select(list);
			dropDownList.selectByValue(selectedOption);
		}
		
		protected static void assertTitle(WebDriver driver, String titleTxt)
		  {
				  String title = driver.getTitle();
			      Assert.assertTrue(title.contains(titleTxt));
		  }
		public static void moveAndClick(WebDriver driver, String className, String xpath)
		  {
			WebElement generalElement = driver.findElement(By.className(className));
		      Actions actions = new Actions(driver);
		      actions.moveToElement(generalElement).perform();
		      WebElement clickableTarget = driver.findElement(By.xpath(xpath));
		      clickableTarget.click();
		      //actions.moveToElement(clickableTarget).click().perform();
		  }
		  
}
