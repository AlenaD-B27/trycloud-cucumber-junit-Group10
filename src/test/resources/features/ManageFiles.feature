Feature: As a user, I should be able to add the folder and upload a file inside a folder

  Scenario: Verify users can add the folder

  @ElenaB
    Given user on the dashboard page
    When the user clicks the "Files" module
    And user clicks the add icon on the top
    And user click "new folder”
    And user write a folder name
    When the user click submit icon
    Then Verify the folder is displayed on the page
