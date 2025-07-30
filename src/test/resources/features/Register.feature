Feature: Register functionality
@Register
  Scenario Outline: User signs up with valid credentials
    Given User navigates to the Home Page
    And User clicks on the Signup/Login button
    And User enters the name "<Name>" and email "<EmailAddress>"
    Then User clicks the Signup button
    And User Click the Mr Radio button
    And User Enter the "<Password>"
    And User Choose the date of birth 
    And user Select the SignUp & Recive CheckBox 
    And User Enter the  firstname as "<FirstName>"
    And User Enter the lastname as "<LastName>"
    And User Enter the Companyname as "<Company>"
    And User Enter the address name as "<Address1>"
    And User Enter The State name as "<State>"
    And User Enter the City name as "<City>"
    And User Enter the Zipcode number as "<Zipcode>"
    And User Enter the  mobile number is "<MobileNumber>"
    Then User click the CreateAccount Buton 
    And User Click the Contiune button 
  
 Examples:
  | Name        | EmailAddress             | PasswordExample   | FirstName  | LastName  | Company | Address1                 | State     | City       | Zipcode  | MobileNumber  |
  | AjayShankar |  testajay@mailinator.com | Test@1234     | Ajay       | Shankar   | Virtusa | 11/25g,Annamadam Street  | Tamilnadu | Coimbatore | 641402   | 9150652670    |  