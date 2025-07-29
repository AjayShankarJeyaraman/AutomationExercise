Feature: Login functionality page

@Product
  Scenario Outline: User signs up with valid credentials
    Given User navigates to the Home Page
    And User clicks on the Signup/Login button
    And User enters the email "<EmailAddress>" and Password "<Ashankar@97>"
    Then User clicks the LoginButton 
    And User click the Product
    And User Enter Product name as "<Product>" in searchBox
    And User Click the Search Icon 
    Then User print the all the Listed tshirt 
  

  Examples:
    | EmailAddress        | Password    | Product |
    | test@mailinator.com | Test@123    | TShirt  |