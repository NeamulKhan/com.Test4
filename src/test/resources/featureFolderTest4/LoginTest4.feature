@LoginTest4

Feature: Login
In order to perform successful login 
As a user I want to enter valid username and password
  
    
 Scenario Outline: In order to verify login to DemoBlaze
    Given launch "<URL>" 
    When user validate the home page title 
    And click login link
    Then user entered "<username>", "<password>" and click login button
    Then verify user successfully logged in

    Examples: 
      | username  | password | status  |
      | raisa     |   123456 | success |
      |           |          | Fail    |
