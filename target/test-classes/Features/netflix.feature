Feature: open netflix page, print the title then print the page URL

  Scenario Outline: Open netflix page and then print the title and URL
    Given user is open Netflix home page
    And maximize the page
    When the page loaded
    Then the title is print
    And the URL is print
