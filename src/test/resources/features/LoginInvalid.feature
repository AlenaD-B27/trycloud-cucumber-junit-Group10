Feature: Feature: As a user, I should be able to log in.
  @2
Scenario Outline: Verify user login fail with invalid credentials
Given  user on the login page
When user enter invalid "<username>" username and "<password>" password
And user click the login button
Then verify "<message>" message should be displayed

Examples:
  | username | password    | message                     |
  | User10   | Wrong       | Wrong username or password. |
  | Wrong143 | Userpass123 | Wrong username or password. |
  | User     | Wrong       | Wrong username or password. |
  | Userpass | Userpass123 | Wrong username or password. |