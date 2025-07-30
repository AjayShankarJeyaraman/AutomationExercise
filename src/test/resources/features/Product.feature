Feature: Login functionality page

@Product
  Scenario Outline: User signs up with valid credentials
    Given User navigates to the Home Page
     And User click the Product
    And User Enter Product name as "<Product>" in searchBox
    And User Click the Search Icon 
    Then User print the all the Listed tshirt 
  

  Examples:
   | Product |
   | TShirt  |
   
   @AllProduct
   Scenario Outline: Verify All Products and product detail page
    Given User navigates to the Home Page
    And User click the Product
    And User Cick The ViewProduct Button 
    Then Verify that detail detail is visible: product name, category, price, availability, condition, brand
   