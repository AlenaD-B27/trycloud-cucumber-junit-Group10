@smoke @regression
Feature: As a user, I should be accessing all the main modules of the app.

  Background:
    Given user on the login page
    When user enter username "user10" and passcode "Userpass123"
    When user enter username "user40" and passcode "Userpass123"
    When user enter username "user70" and passcode "Userpass123"
    When user enter username "user100" and passcode "Userpass123"

  @us_03
  Scenario Outline: Verify users accessing all the main modules of the app.
    When the users log in with valid credentials
    Then Verify the user see the following modules:

      Examples:
          |Dashboard|
          |Files    |
          |Photos   |
          |Activity |
          |Talk     |
          |Contacts |
          |Circles  |
          |Calendar |
          |Deck     |