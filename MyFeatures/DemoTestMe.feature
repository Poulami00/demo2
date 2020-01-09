Feature: TestMeApp validation

  Background: Launch TestMeAPP
    Given User launches the application

  Scenario Outline: Login for TestMeApp
    Given user enters username "<user>"
    Then user enters password "<pass>"
    When user clicks on Submit button
    Then user clicks on AllCategories
    When user clicks on Electronics
    Then user clicks on Headphone
    Then user clicks on AddToCart
    Then user clicks on cart
    Then user clicks on remove and closes the app

    Examples: 
      | user    | pass        |
      | Lalitha | Password123 |
      | Lalitha | Password123 |
      | Lalitha | Password123 |
