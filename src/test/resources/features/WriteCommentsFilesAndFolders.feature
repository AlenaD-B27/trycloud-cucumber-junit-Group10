Feature: User should be able to write comments to files/folders

  @wip
  Scenario: Verify users to write comments to files/folder
    Given user on the dashboard page
    When the user clicks the Files module
    And user click action-icon  from any file on the page
    And user choose the Details option
    And user write a comment inside the input box
    And user click the submit button to post it
    Then Verify the comment is displayed in the comment section.