Feature: login panel data testing with multiple data
@uat @smoke
  Scenario Outline: validating login panel with credential credentials
    Given user is on the login page
    When user enters valid user name "<username>"
    And user enters valid password as"<password>"
    And user clicks on the login button
    Then user should be on the account page
    And user should close the browser
      | username                | password     |
      | abcg                    | bhjkb        |
      | standard_user           | secret_sauce |
      | locked_out_user         | secret_sauce |
      | problem_user            | secret_sauce |
      | performance_glitch_user | secret_user  |
