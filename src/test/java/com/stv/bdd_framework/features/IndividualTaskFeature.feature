Feature: individual task 5

  Scenario Outline: 01. Buying gloves
    Given IndexPage loaded
    And go to the menu item Cycle->Apparel->Gloves
    When GlovesPage loaded
    Then click on the first gloves
    And see the following image
    And change the quantity of products to "<quantity>"
    And click Add_To_Basket button
    When we see a message about the need to select a size
    Then select Small size
    And change the quantity of products to "<quantity>"
    And click Add_To_Basket button
    And click View full Basket
    When check the quantity of ordered gloves "<quantity>"
    Then close Browser

    Examples:
      | quantity |
      | 3        |