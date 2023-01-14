Feature: As a user, I should be able to access to Files module.

  @wip
  Scenario: verify users can access to Files module
    Given user on the dashboard page
    When the user clicks the "Files" module

    Then verify the page title is "Files - trycloud QA"

