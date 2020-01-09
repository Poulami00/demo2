Feature: My Demo on tags
@smoke @regression
Scenario: Registration amazon

Given I launch app
Then I register with valid data
@smoke
Scenario: Login in amazon

Given application is working
And I provide vald data
@regression
Scenario: Ordering in amazon

Given I am placing order for my selected items
@uat @smoke
Scenario: cancellation in amazon

Given i cancel the order as it does not meet my expectations


