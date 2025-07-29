package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;
import java.time.Duration;

public class RegistrationPage {

	private WebDriver driver;

	
	public RegistrationPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	// WebElements with @FindBy

	@FindBy(xpath = "//*[normalize-space(text())='Signup / Login']")
	private WebElement signupLoginBtn;
	
	public void clickSignupLogin() {
		signupLoginBtn.click();
	}


	@FindBy(name = "name")
	private WebElement nameInput;
	
	public void nameInput(String name) {
		nameInput.sendKeys(name);
	}
	
	

	@FindBy(xpath = "(//*[@placeholder='Email Address'])[2]")
	private WebElement emailInput;
	
	public void emailInput(String email) {
		emailInput.sendKeys(email);
	}
	
	

	@FindBy(xpath = "(//*[text()='Signup'])")
	private WebElement Singup;
	
    public void clickSignup() {
    	Singup.click();
    }
	
    @FindBy(id = "id_gender1")
	private WebElement mrRadioButton;

	public void mrRadioButton() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(mrRadioButton));
		mrRadioButton.click();
	}
	
	
	@FindBy(id ="password")
    private WebElement PasswordSet;
	
	public void PasswordSet(String password) {
		PasswordSet.sendKeys(password);
	}
	
	@FindBy(id = "days")
	private WebElement DayInput;
	
	public void DayInput() {
		Select daySelect = new Select(DayInput);
		daySelect.selectByVisibleText("16");
	}

	@FindBy(id = "months")
	private WebElement MonthInput;
	
	public void MonthInput() {
		Select monthSelect = new Select(MonthInput);
		monthSelect.selectByVisibleText("August");
	}

	@FindBy(id = "years")
	private WebElement YearInput;
	
	public void YearInput() {
		Select yearSelect = new Select(YearInput);
		yearSelect.selectByVisibleText("1997");
	}
	
	@FindBy(id="newsletter")
	private WebElement newsletterCheckbox;
	
	public void clickNewsletterCheckbox() {
		if (!newsletterCheckbox.isSelected()) {
			newsletterCheckbox.click();
		}
	}
	@FindBy(id="optin")
	private WebElement receiveOffersCheckbox;
	
	public void clickReceiveOffersCheckbox() {
		if (!receiveOffersCheckbox.isSelected()) {
			receiveOffersCheckbox.click();
		}
	}
	
	@FindBy(id="first_name")
		private WebElement firstNameInput;
	
	public void firstNameInput(String firstName) {
		firstNameInput.sendKeys(firstName);
	}
	
	@FindBy(id="last_name")
	private WebElement lastNameInput;
	
	public void lastNameInput(String lastName) {
		lastNameInput.sendKeys(lastName);
	}
	
	@FindBy(id="company")
	private WebElement companyInput;
	
	public void companyInput(String company) {
		companyInput.sendKeys(company);
	}
	
	@FindBy(id="address1")
	private WebElement address1Input;
	
	public void address1Input(String address1) {
		address1Input.sendKeys(address1);
	}
	
	@FindBy(id="state")
	private WebElement stateInput;
	
	public void stateInput(String state) {
		stateInput.sendKeys(state);
	}
	
	@FindBy(id="city")
	private WebElement cityInput;

	public void cityInput(String city) {
		cityInput.sendKeys(city);
	}
	
	
	@FindBy(id="zipcode")
	private WebElement zipcodeInput;
	
	public void zipcodeInput(String zipcode) {
		zipcodeInput.sendKeys(zipcode);
	}
	
	@FindBy(id="mobile_number")
	private WebElement mobileNumberInput;

	public void mobileNumberInput(String mobileNumber) {
		mobileNumberInput.sendKeys(mobileNumber);
	}
	
	@FindBy(xpath = "//*[text()='Create Account']")
	private WebElement createAccountBtn;
	
	public void clickCreateAccount() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(createAccountBtn));
		createAccountBtn.click();
	}
	
	@FindBy(xpath = "//*[text()='Continue']")
	private WebElement continueBtn;
	
	public void clickContinue() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(continueBtn));
		continueBtn.click();
	}
	
	
	
	
		
}
