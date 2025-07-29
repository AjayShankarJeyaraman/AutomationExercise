package StepDefinition;

import java.util.Properties;

import org.openqa.selenium.WebDriver;

import config.ConfigReader;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pages.loginPage;
import utils.DriverFactory;

public class LoginSteps {
	
	

	private WebDriver driver = DriverFactory.getDriver();
	private loginPage loginpage = new loginPage(driver);

	private ConfigReader configReader = new ConfigReader();
	private Properties prop = configReader.init_prop();
	
	@Given("User enters the email {string} and Password {string}")
	public void user_enters_the_email_and_password(String string, String string2) {
		loginpage.enterEmail(string);
		loginpage.enterPassword(string2);
        System.out.println("Entered Email: " + string);
        System.out.println("Entered Password: " + string2);
	}

	@Then("User clicks the LoginButton")
	public void user_clicks_the_login_button() {
		loginpage.clickLoginButton();
	   System.out.println("Clicked Login button");
	}

}
