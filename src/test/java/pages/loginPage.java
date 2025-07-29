package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginPage {
	private WebDriver driver;

	// Constructor
	public loginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(name = "email")
	private WebElement emailInput;

	@FindBy(name = "password")
	private WebElement passwordInput;

	@FindBy(xpath = "//*[text()='Login']")
	private WebElement loginButton;

	public void enterEmail(String email) {
		emailInput.sendKeys(email);

	}

	public void enterPassword(String password) {
		passwordInput.sendKeys(password);

	}

	public void clickLoginButton() {
		loginButton.click();

	}

}
