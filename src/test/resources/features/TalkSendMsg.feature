Feature: As a user can send a message

Scenario: verify users can send a message
Given user on the dashboard page
When the user clicks the "Talk" module
And user search user from the search box
And user write a message
And user clicks to submit button
Then the user should be able to see the message is displayed on the conversation log
