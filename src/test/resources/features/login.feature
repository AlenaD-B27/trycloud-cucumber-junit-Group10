@smoke @regression

Feature: As a user, I should be able to login.

  @wip
  Scenario Outline: Verify login with valid credentials
    Given user on the login page
    When user enter username "<username>" and passcode "<password>"
    And user click the login button
    Then Verify the user should be at the dashboard page

    Examples:
      | username | password    |
      | User10   | Userpass123 |
      | User40   | Userpass123 |
      | User70   | Userpass123 |
      | User100  | Userpass123 |