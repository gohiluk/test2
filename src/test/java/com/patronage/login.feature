Feature:
  As a user
  I want to be able to login
  So that I can login

  Scenario Outline: Login to Automationpractise
    Given user is on login page
    When user provide correct <login> and <password>
    Then user should be logged in
  Examples:
    | login  | password |
    | a@a.pl | aaaaa    |

  Scenario Outline: Wrong login to Automationpractise
    Given user is on login page
    When user provide wrong <login> and <password>
    Then user shouldn't be logged in
  Examples:
  | login  | password      |
  | b@b.pl | 123123asdfasd |
  | c@c.pl | cc3123asdfasd |