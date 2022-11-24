Feature: Country Functionaliy

  Scenario: Create Country
    Given Naviagate to Campus
    When Enter username and password and click Login button
    Then User should login successfuly
    And Naviagate to country page
    When create a country
    Then Success message should be displayed