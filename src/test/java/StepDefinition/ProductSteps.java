package StepDefinition;

import java.util.Properties;

import org.openqa.selenium.WebDriver;

import config.ConfigReader;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pages.ProductPage;
import pages.loginPage;
import utils.DriverFactory;

public class ProductSteps {
   
	private WebDriver driver = DriverFactory.getDriver();
	private ProductPage productPage = new ProductPage(driver);

	private ConfigReader configReader = new ConfigReader();
	private Properties prop = configReader.init_prop();

@Then("User click the Product")
public void user_click_the_product() {
	productPage.clickProduct();
	System.out.println("Clicked on Product");
    
}

@Then("User Enter Product name as {string} in searchBox")
public void user_enter_product_name_as_in_search_box(String string) {
    productPage.enterProductName(string);
    System.out.println("Entered Product Name: " + string);
}

@Then("User Click the Search Icon")
public void user_click_the_search_icon() {
    productPage.clickSearchIcon();
    System.out.println("Clicked on Search Icon");
}

@Then("User print the all the Listed tshirt")
public void user_print_the_all_the_listed_tshirt() {
	System.out.println("Printing all the listed products:");
	productPage.printAllProductNames();
	System.out.println("Listed products printed successfully.");
}



@Given("User Cick The ViewProduct Button")
public void user_cick_the_view_product_button() {
	productPage.ClickProduct1();
 System.out.println("Cick The ViewProduct Button");
   
}

@Then("Verify that detail detail is visible: product name, category, price, availability, condition, brand")
public void verify_that_detail_detail_is_visible_product_name_category_price_availability_condition_brand() {
	productPage.printProductName();
	productPage.Printcategory();
	productPage.PrintPrice();
	productPage.PrintAvalability();
	productPage.Printcategory();
	productPage.PrintBrand();
	
   
}

}
