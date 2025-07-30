Feature: Verify Contact Us Functionality

  @ContactUs
  Scenario Outline: User submits Contact Us form with valid credentials
    Given User navigates to the Home Page
    And User clicks the Contact Us button
    And User enters the Name as "<Name>"
    And User enters the Email as "<Email>"
    And User enters the Subject as "<Subject>"
    And User enters the Body as "<Body>"
    And User chooses the File as "<FileLocation>"
    And User clicks the Submit button
    Then User validates Contact Us submission

    Examples:
      | Name        | Email                 | Subject                                         | Body                                                                                                                                                                                                                                           | FileLocation                                                |
      | AjayShankar | Google@mailinator.com | Inquiry Regarding Your Services / Need Assistance | Hello Team,\n\nI recently visited your website and would like to know more about your services. Specifically, I’m interested in task management features, pricing plans, or support.\n\nPlease let me know how I can proceed or whom I should contact for further discussion.\n\nThank you! |  |
