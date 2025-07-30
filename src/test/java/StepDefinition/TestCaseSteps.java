package StepDefinition;

import java.util.Properties;

import org.openqa.selenium.WebDriver;

import config.ConfigReader;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pages.TestCasePage;
import utils.DriverFactory;

public class TestCaseSteps {

	private WebDriver driver = DriverFactory.getDriver();
	private TestCasePage testCasePage = new TestCasePage(driver);
	private ConfigReader configReader = new ConfigReader();
	private Properties prop = configReader.init_prop();

	@Given("User Click TestCase Button")
	public void user_click_test_case_button() {
		testCasePage.clickTestCaseButton();
		System.out.println("Clicked on Test Case Button");
	}

	@Then("Verify user is navigated to test cases page successfully")
	public void verify_user_is_navigated_to_test_cases_page_successfully() {
		testCasePage.verifyTestCasePage();

	}
	
	

}
