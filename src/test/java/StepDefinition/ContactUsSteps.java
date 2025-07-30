package StepDefinition;

import java.util.Properties;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;

import config.ConfigReader;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pages.ContactUsPage;
import utils.DriverFactory;

public class ContactUsSteps {

	private WebDriver driver = DriverFactory.getDriver();
	private ContactUsPage contactUsPage = new ContactUsPage(driver);

	private ConfigReader configReader = new ConfigReader();
	private Properties prop = configReader.init_prop();

	@Given("User clicks the Contact Us button")
	public void user_clicks_the_contact_us_button() {
		contactUsPage.clickContactUsButton();
		System.out.println("Clicked Contact Us button");
	}

	@Given("User enters the Name as {string}")
	public void user_enters_the_name_as(String string) {

		contactUsPage.enterName(string);
		System.out.println("Entered Name: " + string);

	}

	@Given("User enters the Email as {string}")
	public void user_enters_the_email_as(String string) {
		contactUsPage.enterEmail(string);
		System.out.println("Entered Email: " + string);

	}

	@Given("User enters the Subject as {string}")
	public void user_enters_the_subject_as(String string) {
		contactUsPage.enterSubject(string);
		System.out.println("Entered Subject: " + string);
	}

	@Given("User enters the Body as {string}")
	public void user_enters_the_body_as(String string) {
		contactUsPage.enterBody(string);
		System.out.println("Entered Body: " + string);
	}

	@Given("User chooses the File as {string}")
	public void user_chooses_the_file_as(String string) {
		 contactUsPage.chooseFile(string);
		 System.out.println("Chosen File: " + string);
		 
	}

	@Given("User clicks the Submit button")
	public void user_clicks_the_submit_button() {
		contactUsPage.clickSubmitButton();
		System.out.println("Clicked Submit button");
	}

	@Then("User validates Contact Us submission")
	public void user_validates_contact_us_submission() {
		Alert alert = driver.switchTo().alert();
		alert.accept();

		String expectedMessage = "Success! Your details have been submitted successfully.";
		String actualMessage = contactUsPage.getConfirmationMessage();
		if (actualMessage.equals(expectedMessage)) {
			System.out.println("Contact Us submission validated successfully.");
		} else {
			System.out.println("Contact Us submission validation failed. Expected: " + expectedMessage + ", but got: "
					+ actualMessage);
		}

		contactUsPage.clickHomeButton();
		System.out.println("Clicked Home button after Contact Us submission.");
	}

}
