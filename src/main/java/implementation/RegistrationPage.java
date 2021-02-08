package implementation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegistrationPage extends PageBase
{
	public RegistrationPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(id="id_gender1")
	WebElement genderMaleRadioBtn;
	
	@FindBy(id="id_gender2")
	WebElement genderFemaleRadioBtn;
	
	@FindBy(id="customer_firstname")
	WebElement firstNameTxtBox;
	
	@FindBy(id="customer_lastname")
	WebElement lastNameTxtBox;
	
	@FindBy(id="passwd")
	WebElement passwordTxtBox;
	
	@FindBy(id="days")
	WebElement daysDropDownList;
	
	@FindBy(id="months")
	WebElement monthsDropDownList;
	
	@FindBy(id="years")
	WebElement yearsDropDownList;
	
	@FindBy(id="firstname")
	WebElement firstNameTxtBox2;
	
	@FindBy(id="lastname")
	WebElement lastNameTxtBox2;
	
	@FindBy(id="address1")
	WebElement addressTxtBox;
	
	@FindBy(id="city")
	WebElement cityTxtBox;
	
	@FindBy(id="id_state")
	WebElement stateDropDownList;
	
	@FindBy(id="postcode")
	WebElement postalCodeTxtBox;
	
	@FindBy(id="phone_mobile")
	WebElement mobilePhoneTxtBox;
	
	@FindBy(id="alias")
	WebElement aliasTxtBox;
	
	@FindBy(id="submitAccount")
	WebElement registerBtn;
	
	public void registerUser(String gender, String custFName, String custLName, String password, String day, 
			String month, String year, String fname, String lname, String address1, String city, String state, String postalCode, 
			String mobileNo, String alias)
	{
		/*complete registration form
		 select gender */
		if(gender.contains("female"))
			clickButton(genderFemaleRadioBtn);
		else
			clickButton(genderMaleRadioBtn);
	
		// Enter First Name
		enterText(firstNameTxtBox, custFName);

		//Enter Last name
		enterText(lastNameTxtBox, custLName);

		//Email is already registered, enter password
		enterText(passwordTxtBox, password);
		
		/* select Date of Birth*/
		// select day
		selectDropDown(daysDropDownList, day);
		
		// select month
		selectDropDown(monthsDropDownList, month);
		
		// select year
		selectDropDown(yearsDropDownList, year);
		
		// Enter Address First Name
		enterText(firstNameTxtBox2, fname);
		
		// Enter Address Last Name
		enterText(lastNameTxtBox2, lname);
		
		// Enter Address
		enterText(addressTxtBox, address1);
		
		// Enter City
		enterText(cityTxtBox, city);
		
		//Choose State
		selectDropDown(stateDropDownList, state);
		
		// Enter Postal code
		enterText(postalCodeTxtBox, postalCode);
		
		// Enter Mobile Phone
		enterText(mobilePhoneTxtBox, mobileNo);
		
		// Enter Address alias
		enterText(aliasTxtBox, alias);
		
		//Submit Registration
		clickButton(registerBtn);
	}
	
}
