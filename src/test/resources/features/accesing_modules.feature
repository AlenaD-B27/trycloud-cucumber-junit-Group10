@smoke @regression
Feature: As a user, I should be accessing all the main modules of the app.

  Background:
    Given user on the login page

  @us_03
  Scenario: Verify users accessing all the main modules of the app.
    When the users log in with valid credentials
    Then Verify the user see the following modules:

          |Dashboard|
          |Files    |
          |Photos   |
          |Activity |
          |Talk     |
          |Contacts |
          |Circles  |
          |Calendar |
          |Deck     |