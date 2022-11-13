Feature: As a user, I should be able to view the contact list.
  @wip
  Scenario: verify users can see all the contact names on the contact list
    Given "<user>" on the dashboard page
    When the user clicks the contacts module
    Then verify the contact names are in the list