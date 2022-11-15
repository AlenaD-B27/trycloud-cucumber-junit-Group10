Feature: As a user, I should be able to access to Talks module

  @wip
  Scenario: verify users to access to Talks module
    Given user on the dashboard page
    When the user clicks the "Talk" module
    Then verify the page title is "Talk - Trycloud QA"
  |Username|Password|
  |User10  |Userpass123|
  |User40  |Userpass123|
  |User70  |Userpass123 |
  |User100 |Userpass123



