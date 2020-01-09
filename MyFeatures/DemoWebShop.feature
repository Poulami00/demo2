
Feature: DemoWebShop Validations
  

  Scenario: Guest user registration in DemoWebShop
    Given User launches the DemoWebShop app
    Then User clicks on SignIn Button
    And User provides the valid data for all the fields
    When User clicks on Submit button at the end of the form
    Then Verifies the result of the registration
    And prints the message

 
  Scenario: Registered User login in DemoWebShop
    Given Application launched by registered user
    Then User acess the Login link
 		And provides the valid data as input
    And verifies the login status

