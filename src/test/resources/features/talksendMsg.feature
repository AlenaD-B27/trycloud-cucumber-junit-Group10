Feature: As a user can send a message

  @TC-2
  Scenario Outline: verify users can send a message
    Given "<user>" on the dashboard page
    When the user clicks the Talk module
    And user search user from the search box
    And user write a message
    And user clicks to submit button
    Then the user should be able to see the message is displayed on the conversation log

    Examples:
      | user | password   |
      | User10   | Userpass123 |
      | User40   | Userpass123 |
      | User70   | Userpass123 |
      | User100  | Userpass123 |