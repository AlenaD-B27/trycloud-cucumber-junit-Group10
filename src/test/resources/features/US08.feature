@us_08
Feature: As a user, I should be able to delete a file/folder.
  Background:
    Given user on the dashboard page
  @wip
  Scenario: Verify users delete a file/folder
    When the user clicks the "Files" module
    And user click action-icon  from any file on the page
    And user choose the "Delete f" option
    When the user clicks the "Deleted files" sub-module on the left side
    Then Verify the deleted file is displayed on the page.