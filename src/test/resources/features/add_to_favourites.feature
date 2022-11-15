Feature: As a user, I should be able to access to Files module - Favorites button

  @us5
  Scenario Outline: Verify users to add files to Favorites

    Given "<user>" on the dashboard page
    When the user clicks the "Files" module
    When the user clicks action-icon  from any file on the page
    And user choose the "Add to favorites" option
    And user click the "Favorites" sub-module on the left side
    Then Verify the chosen file is listed on the table

    Examples: usernames:
      |user|
      |User10  |
      |User40  |
      |User70  |
      |User100 |

    Scenario: Lets say it is some scenario here

      Given "<user>" on the dashboard page
      When the user clicks the "Files" module
      And user does simethinhg else
      And user logs out
