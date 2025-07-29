Feature: Login functionality page

@Login
  Scenario Outline: User signs up with valid credentials
    Given User navigates to the Home Page
    And User clicks on the Signup/Login button
    And User enters the email "<EmailAddress>" and Password "<Ashankar@97>"
    Then User clicks the LoginButton 

  

  Examples:
    | EmailAddress       | Password  | 
    |tcs@mailinator.com |Tcs@123   | 