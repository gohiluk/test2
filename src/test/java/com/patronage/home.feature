Feature:
  As a user
  I want to be able to search clothes
  So that I can see search results

  Scenario: Search for clothes
    Given user is on home page
    When user provide search phase
    Then user should see search results

  Scenario: Search for unknown phase example asd
    Given user is on home page
    When user provide unknown search phase
    Then user should see no results