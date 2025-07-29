package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductPage {
	
	private WebDriver driver;
	
	@FindBy(xpath ="//*[text()=' Products']")
	private WebElement product;
	
	public void clickProduct() {
		product.click();
	}
	
	@FindBy(id = "search_product")
	private WebElement searchBox;
	
	public void enterProductName(String productName) {
		searchBox.sendKeys(productName);
	}
	
	@FindBy(id = "submit_search")
	private WebElement searchIcon;
	
	public void clickSearchIcon() {
		searchIcon.click();
	}
	
	
	

}
