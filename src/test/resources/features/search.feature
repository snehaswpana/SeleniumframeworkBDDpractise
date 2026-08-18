@regression
Feature: Google Search

  Scenario Outline: Search different keywords in Google
    Given I open Google
    When I search for "<searchText>"
    Then the search should be performed

    Examples:
      | searchText |
      |  python   |
      | Java       |
      | Cucumber   |