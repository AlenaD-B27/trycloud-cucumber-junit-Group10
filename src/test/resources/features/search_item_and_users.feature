
@wip
Feature:  As a user, I should be able to search any files/folder/users from the homepage.
  Scenario Outline: : Verify users can search any files/folder/users from the search box.
    Given <user> on the dashboard page
    When User can click the magnifying glass icon
    And  User can write "<searchValue>" into the text box
    Then verify the app displays the "<expectedResult>" option



    Examples:
      | searchValue | expectedResult|
      | Terica      | Terica        |
      | Talk        | Talk          |
      | file5       | file5         |
      | file1       | file1         |
      | User7       | User7         |
      | User40      | User40        |
      | User62      | User62        |



