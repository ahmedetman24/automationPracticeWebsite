package stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import implementation.AccessBlousesPage;
import implementation.BlousesResultPage;
import implementation.HomePage;
import implementation.LoginPage;
import implementation.RegistrationPage;
import implementation.ShowProductPage;
import implementation.SummaryPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import testCases.TestBase;


public class UserRegistration extends TestBase
{

	HomePage homePage;
	LoginPage loginPage;
	RegistrationPage registrationPage;
	AccessBlousesPage accessBlousesPage;
	BlousesResultPage blousesResultPage;
	ShowProductPage showProductPage;
	SummaryPage summaryPage;
	WebDriverWait wait;
		
	@Given("The user is in the home page")
	public void the_user_is_in_the_home_page() 
	{
		Assert.assertEquals(driver.getTitle(), "My Store");
	}

	@When ("^The user click on Sign in button$")
	public void The_user_click_on_Sign_in_button() throws InterruptedException
	{
		homePage = new HomePage(driver);
		homePage.OpenRegistrationPage(driver);
	}

	@SuppressWarnings("deprecation")
	@When("Enter {string}")
	public void enter(String email) throws InterruptedException 
	{
		wait = new WebDriverWait(driver, 20);
		Assert.assertEquals(driver.getTitle(), "Login - My Store");
		
		System.out.println("Enter Email");
		loginPage = new LoginPage(driver);
		System.out.println("Email value is: "+email);
		loginPage.enterEmail(email);
	}
	
	@When("create account with {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}")
	public void create_account_with(String gender, String custFName, String custLName, String password, 
			String day, String month, String year, String fname, String lname, String address1, String city, String state,
			String postalCode, String mobileNo, String alias) throws InterruptedException
	{
		// Registration page
		wait.until(ExpectedConditions.elementToBeClickable(By.id("id_gender1")));
		System.out.println("registration page");
		registrationPage = new RegistrationPage(driver);
		registrationPage.registerUser(gender, custFName, custLName, password, day, month, year, fname, lname, address1, city, state,
			       postalCode, mobileNo, alias);
	}

	@Then ("^The user can purchase$")
	public void The_user_can_purchase() throws InterruptedException
	{
		//Choose Blouses
		accessBlousesPage = new AccessBlousesPage(driver);
		accessBlousesPage.chooseBlouse(driver);

		//Select resulted product
		blousesResultPage = new BlousesResultPage(driver);
		blousesResultPage.chooseResultBlouse(driver);

		//Choose color and size
		showProductPage = new ShowProductPage(driver);
		showProductPage.chooseResultBlouse(driver);

		//Summary
		summaryPage = new SummaryPage(driver);
		summaryPage.chooseResultBlouse(driver);

	}

}
