package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContactUsPage {
	
	private WebDriver driver;
	public ContactUsPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//*[text()=' Contact us']")
	private WebElement contactUsButton;
	
	@FindBy(name = "name")
	private WebElement nameField;
	
	@FindBy(name = "email")
	private WebElement emailField;
	
	@FindBy(name = "subject")
	private WebElement subjectField;
	
	@FindBy(id = "message")
	private WebElement bodyField;
	
	@FindBy(name = "upload_file")
	private WebElement fileInput;
	
	@FindBy(name = "submit")
	private WebElement submitButton;
	
	@FindBy(xpath = "//div[@class='status alert alert-success']")
	private WebElement confirmationMessage;
	
	@FindBy(xpath = "(//*[text()=' Home'])[2]")
    private WebElement HomeButton;
	
	public void clickContactUsButton() {
		contactUsButton.click();
	}
	
	public void enterName(String name) {
		nameField.sendKeys(name);
	}
	
	public void enterEmail(String email) {
		emailField.sendKeys(email);
	}
	
	public void enterSubject(String subject) {
		subjectField.sendKeys(subject);
	}
	
	public void enterBody(String body) {
		bodyField.sendKeys(body);
	}
	
	public void chooseFile(String filePath) {
		fileInput.sendKeys(filePath);
	}

	public void clickSubmitButton() {
		submitButton.click();
	}

	public String getConfirmationMessage() {
		return confirmationMessage.getText();
	}
	
	public void clickHomeButton() {
        HomeButton.click();
	}
	

}
