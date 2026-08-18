@smoke
Feature: Google Search

  Scenario: Search for Selenium in Google
    Given I open Google
    When I search for "Selenium"
    Then the search should be performed