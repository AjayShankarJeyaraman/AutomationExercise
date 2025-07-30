package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TestCasePage {

	
private WebDriver driver;

	
	public TestCasePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//*[text()=' Test Cases']")
	private WebElement testCaseButton;

	@FindBy(xpath = "//*[text()='Test Cases']")
	private WebElement testCaseHeader;

	public void clickTestCaseButton() {
		testCaseButton.click();
	}

	public void verifyTestCasePage() {
		String text = testCaseHeader.getText();
		System.out.println("Test Case Page Header: " + text);

	}
}
