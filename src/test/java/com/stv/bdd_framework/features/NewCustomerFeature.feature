Feature: add new customer

  Scenario: 01. Add new customer with valid email-address
    Given myAccount page loaded
    When  the User entered valid email-address
    And  there is no other user with the same email address
    And  the User clicks the Continue button
    Then going to the registration page

  Scenario Outline: 02. Add new customer with invalid email-address
    Given myAccount page loaded
    When  the User entered invalid email-address "<email-address>"
    And  the User clicks the Continue button
    Then see the emailErrorMessage
    Examples:
      | email-address |
      | test          |
      | gmail.com     |
      | @gmail.com    |
      | 111@gmail     |