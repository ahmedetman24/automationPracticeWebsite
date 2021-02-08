package testCases;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import io.cucumber.testng.AbstractTestNGCucumberTests;

public class TestBase extends AbstractTestNGCucumberTests // to run with cucumber options
{
	public static ChromeDriver driver;

	@BeforeTest
	public void openSite()
	{
		// attach driver in our project to be used
		String driverPath = System.getProperty("user.dir") + "\\resources\\drivers\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", driverPath);

		// open driver
		driver = new ChromeDriver();
		
		//Resize the screen
		org.openqa.selenium.Dimension dimentions = new org.openqa.selenium.Dimension(1024, 768);
		driver.manage().window().setSize(dimentions);
		System.out.println("size ok");
		//driver.manage().window().maximize();
		driver.navigate().to("http://automationpractice.com/index.php");
	}
	
	@AfterTest
	public void endTest() throws InterruptedException
	{
		//Thread.sleep(3000);
		driver.quit();
	}
}
