package pages;

import java.util.List;
import java.util.Locale.Category;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductPage {
	
	private  WebDriver driver;
	public ProductPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	
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
	
	@FindBy(xpath = "(//*[text()='View Product'])[1]")
	private WebElement Product1;
	
	@FindBy(xpath = "//*[text()='Blue Top']")
	private WebElement ProductName;
	
	@FindBy(xpath ="//*[text()='Category: Women > Tops']")
	private WebElement category;
	
	@FindBy(xpath = "//*[text()='Rs. 500']")
	private WebElement price;
	
	@FindBy(xpath = "//*[text()=' In Stock']")
	private WebElement availability;
	
	@FindBy(xpath ="//*[text()=' New']")
	private WebElement condition;
	
	@FindBy(xpath ="//*[text()=' Polo']")
	private WebElement brand;
	
	
	public void clickSearchIcon() {
		searchIcon.click();
	}
	@FindBy(xpath = "//div[@class='productinfo text-center']/p")
	private List<WebElement> productNames;

	public void printAllProductNames() {
	    System.out.println("Total products: " + productNames.size());
	    for (WebElement product : productNames) {
	        System.out.println(product.getText());
	    }
	}
	
	public void ClickProduct1() {
		Product1.click();
		
	}

	public void printProductName() {
		String Productname = ProductName.getText();
		System.out.println("Product Name is: " + Productname);
	}
	
	public void Printcategory() {
		String catagoryname = category.getText();
		System.out.println("Catagory name is: " + catagoryname);
		
	}
	
	public void PrintPrice() {
		String PriceValue=price.getText();
		System.out.println("Pricevalue is: " + PriceValue);
		
	}
	
	public void PrintAvalability() {
		String AvalabilityStatus = availability.getText();
		System.out.println("Avalability Status is: " + AvalabilityStatus);
	}
	 
	public void PrintCondition() {
		String ConditionStatus =condition.getText();
		System.out.println("Conditionstatus Status is: " + ConditionStatus);
		
	}
	
	public void PrintBrand() {
		String PrintBrand = brand.getText();
		System.out.println("PrintBrand Status is: " + PrintBrand);
	}

}
