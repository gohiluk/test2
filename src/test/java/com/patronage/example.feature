Feature:
  As a user
  I want to be able to search Google
  So that I can see search results

  Scenario: Search for something in Google
    Given user is on start page
    When user provide search phase
    Then user should see search results

