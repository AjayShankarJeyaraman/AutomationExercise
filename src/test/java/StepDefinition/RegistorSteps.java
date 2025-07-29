package StepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

import java.util.Properties;

import org.openqa.selenium.WebDriver;

import config.ConfigReader;
import pages.RegistrationPage;
import utils.DriverFactory;

public class RegistorSteps {

	private WebDriver driver = DriverFactory.getDriver();
	private RegistrationPage registrationPage = new RegistrationPage(driver);

	private ConfigReader configReader = new ConfigReader();
	private Properties prop = configReader.init_prop();

	@Given("User navigates to the Home Page")
	public void user_navigates_to_the_home_page() {

		driver.get(prop.getProperty("url"));
		String currentUrl = driver.getCurrentUrl();
		System.out.println("Current URL: " + currentUrl);
	}

	@Given("User clicks on the Signup\\/Login button")
	public void user_clicks_on_the_signup_login_button() {

		registrationPage.clickSignupLogin();
		System.out.println("Clicked on Signup/Login button");
	}

	@Given("User enters the name {string} and email {string}")
	public void user_enters_the_name_and_email(String name, String email) throws InterruptedException {
		registrationPage.nameInput(name);
		registrationPage.emailInput(email);
		System.out.println("Entered Name: " + name + ", Email: " + email);

	}

	@Then("User clicks the Signup button")
	public void user_clicks_the_signup_button() throws InterruptedException {
		// Wait for 1 minute before proceeding
		registrationPage. clickSignup();
	}
	

@Then("User Click the Mr Radio button")
public void user_click_the_mr_radio_button() throws InterruptedException {
    Thread.sleep(10000); // Wait for 1 second before clicking
	registrationPage.mrRadioButton();
	System.out.println("Clicked Mr Radio button");
}

@Then("User Enter the {string}")
public void user_enter_the(String string) {
    // Write code here that turns the phrase above into concrete actions
	registrationPage.PasswordSet(string);
	    System.out.println("Entered Password: " + string);
}

@Then("User Choose the date of birth")
public void user_choose_the_date_of_birth() {
    	registrationPage.DayInput();
    	registrationPage.MonthInput();
    	registrationPage.YearInput();
    	System.out.println("Selected date of birth");
    	
}


@Then("user Select the SignUp & Recive CheckBox")
public void user_select_the_sign_up_recive_check_box() {
   registrationPage.clickNewsletterCheckbox();
   registrationPage.clickReceiveOffersCheckbox();
}

@Then("User Enter the  firstname as {string}")
public void user_enter_the_firstname_as(String string) {
   registrationPage.firstNameInput(string);
   System.out.println("Entered Firstname: " + string);
}

@Then("User Enter the lastname as {string}")
public void user_enter_the_lastname_as(String string) {
	registrationPage.lastNameInput(string);
	System.out.println("Entered Lastname: " + string);
}

@Then("User Enter the Companyname as {string}")
public void user_enter_the_companyname_as(String string) {
	registrationPage.companyInput(string);
	System.out.println("Entered Companyname: " + string);
}

@Then("User Enter the address name as {string}")
public void user_enter_the_address_name_as(String string) {
	registrationPage.address1Input(string);
	System.out.println("Entered Address: " + string);
}

@Then("User Enter The State name as {string}")
public void user_enter_the_state_name_as(String string) {
	registrationPage.stateInput(string);
	System.out.println("Entered State: " + string);
}

@Then("User Enter the City name as {string}")
public void user_enter_the_city_name_as(String string) {
	registrationPage.cityInput(string);
	System.out.println("Entered City: " + string);
}

@Then("User Enter the Zipcode number as {string}")
public void user_enter_the_zipcode_number_as(String string) {
	registrationPage.zipcodeInput(string);
	System.out.println("Entered Zipcode: " + string);
}

@Then("User Enter the  mobile number is {string}")
public void user_enter_the_mobile_number_is(String string) {
	registrationPage.mobileNumberInput(string);
	System.out.println("Entered Mobile Number: " + string);
}

@Then("User click the CreateAccount Buton")
public void user_click_the_create_account_buton() {
	registrationPage.clickCreateAccount();
	System.out.println("Clicked Create Account Button");
}

@Then("User Click the Contiune button")
public void user_click_the_contiune_button() {
	registrationPage.clickContinue();
	System.out.println("Clicked Continue Button");
}




}
