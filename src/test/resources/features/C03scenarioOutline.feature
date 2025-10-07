@scenarioOutline
  Feature: sign in sauce demo
  In this feature we will use scenario outline
    to sign in to the application with different credentials

    Scenario Outline: Sign in with differrent valid credentials
      Given I am on sauceDemo application
      When I enter "<username>" as username
      And I enter "<password>" as password
      And I click on sign in button
      Then I should be redirected to Products page
      And I should see product inventory

      @positiveUsers
      Examples:
        | username      | password     |
        | standard_user | secret_sauce |
        | problem_user  | secret_sauce |
        | visual_user   | secret_sauce |

      # Below scenario is intentionally set to be failed
      @lockedUser
      Examples:
        | username | password |
        | locked_out_user | secret_sauce |

    @negativeLogin @SauceDemo
    Scenario Outline: Negative login scenarios with invalid credentials
      Given I am on sauceDemo application
      When I enter "<username>" as username
      And I enter "<password>" as password
      And I click on sign in button
      Then I should see error message "<errorMessage>"
      And I should remain on login page

      Examples:
        | username        | password     | errorMessage                                                |
        |                 | secret_sauce | Username is required                                        |
        | standard_user   |              | Password is required                                        |
        |                 |              | Username is required                                        |
        | standard_user   | wrong_pass   | Username and password do not match any user in this service |
        | invalid_user    | secret_sauce | Username and password do not match any user in this service |
        | locked_out_user | secret_sauce | Sorry, this user has been locked out.                       |