Feature: add new customer

  Scenario: 01 add new customer with valid email-address
    Given myAccount page loaded
    When  the User entered valid email-address
    And  there is no other user with the same email address
    And  the User clicks the Continue button
    Then going to the registration page

