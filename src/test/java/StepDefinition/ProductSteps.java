package StepDefinition;

import java.util.Properties;

import org.openqa.selenium.WebDriver;

import config.ConfigReader;
import io.cucumber.java.en.Then;
import pages.ProductPage;
import pages.loginPage;
import utils.DriverFactory;

public class ProductSteps {
   
	private WebDriver driver = DriverFactory.getDriver();
	private ProductPage productPage = new ProductPage();

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
	// Assuming there's a method in ProductPage to get the list of products
	// This is a placeholder for the actual implementation
	System.out.println("Listed T-shirts: ");
	// productPage.getListedTshirts().forEach(System.out::println);
	System.out.println("This feature is not implemented yet.");
}


}
