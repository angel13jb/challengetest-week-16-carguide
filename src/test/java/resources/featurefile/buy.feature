Feature: Search functionality
  As user I want to buy car from carsguide website


  Scenario Outline: Search the buy car with model
    Given I am on homepage
    When I mouse hover on “buy+sell” tab
    And I click 'Search Cars' link
    Then I navigate to 'new and used car' search page
    And I select make "<make>"
    And I select model "<model>"
    And I select location "<location>"
    And I select price "<price>"
    And I click on Find My Next Car tab
    Then I should see the make "<make>" in results
    Examples:
      | make       | model     | location            | price   |
      | Audi       | A1        | NSW - Central Coast | $45,000 |
      | Land Rover | Discovery | NSW - Sydney        | $50,000 |
      | Kia        | Sportage  | NT - North          | $35,000 |
      | Nissan     | X-TRAIL   | ACT - ALL           | $50,000 |
      | Jaguar     | X Type    | NSW - Hunter        | $60,000 |
      | Mini       | Cooper    | QLD - All           | $70,000 |


  Scenario Outline: Search the used car with model
    Given I am on homepage
    When I mouse hover on “buy+sell” tab
    And I click ‘Used’ link
    Then I navigate to ‘Used Cars For Sale’ page
    And I select make "<make>"
    And I select model "<model>"
    And I select location "<location>"
    And I select price "<price>"
    And I click on Find My Next Car tab
    Then I should see the make "<make>" in results
    Examples:
      | make   | model   | location  | price   |
      | Audi   | A3      | NSW - All | $15,000 |
      | BMW    | 118d    | VIC - All | $20,000 |
      | Jeep   | Compass | QLD - All | $20,000 |
      | Kia    | Rio     | VIC - All | $10,000 |
      | Nissan | Cube    | WA - All  | $20,000 |
      | Mazda  | CX-5    | NSW - All | $10,000 |