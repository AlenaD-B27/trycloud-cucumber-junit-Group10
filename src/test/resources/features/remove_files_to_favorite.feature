Feature: As a user, I should be able to remove files from favorites and upload a file directly


  Scenario Outline:  user should  remove files to Favorites
    Given user already on the page he or she inputs  "<userName>" and "<password>" on the page
    When the user clicks the Files module
    When the users click action-icon from any file on the page to remove
    And  user choose the "Remove from favorites" option
    And user click the "Favorites" sub-module on the left side
    Then Verify that the file is removed from the Favorites sub-module’s table

    Examples: credentials

      | userName | password    |
      | User10   | Userpass123 |
      | User40   | Userpass123 |
      | User70   | Userpass123 |
      | User100  | Userpass123 |





