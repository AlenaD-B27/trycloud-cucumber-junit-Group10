@login @smoke @regression
Feature: As a user, I should be able to access to Talks module

  Accounts are: User10, User40, User70, User100

  Background: For the scenarios in the feature file, user is expected to be on login page
    Given user on the dashboard page "<username>"
@smoke
  Scenario Outline: verify users to access to Talks module
    When user enter valid "<username>" and "<password>"
    And user clicks the login button
    And user clicks the "Talk" module
    And user clicks "Talk" button
    Then verify the page title is "Talk - Trycloud QA"
    Examples:
      | username | password    |
      | User10   | Userpass123 |
      | User40   | Userpass123 |
      | User70   | Userpass123 |
      | User100  | Userpass123 |
