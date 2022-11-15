
@wip
Feature:  As a user, I should be able to search any files/folder/users from the homepage.
  Scenario Outline: : Verify users can search any files/folder/users from the search box.
    Given user on the dashboard page
    When User can click the magnifying glass icon
    And  User can write "<searchValue>" into the text box
    Then verify the app displays the "expectedResult" option
   # And  User can click on the file name
    #Then User can see the details side page of the "expectedResult"


    Examples:
      | searchValue | expectedResult|
      | Readme      | Readme        |
      | Talk        | Talk          |
      | Notes       | Notes         |
      | User16      | User16        |
      | User62      | User62        |
      | User40      | User40        |
      | User21      | User21        |
      | User29      | User29        |


