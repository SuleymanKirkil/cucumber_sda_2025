@hooksFeature
  Feature: sign in sauce demo
  As a user
  I want to sign in
  so that I can use the sauce demo application

    @hooks @SauceDemo
    Scenario: Sign in with valid credentials
      Given I am on sauceDemo application
      When I enter "standard_user" as username
      And I enter "secret_sauce" as password
      And I click on sign in button
      Then I should be redirected to Products page
      And I should see product inventory

