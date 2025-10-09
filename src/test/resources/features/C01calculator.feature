@calculator
Feature: Calculator Operations
// You can write any explanations like simple text or leave here empty
  As a user
  I want to do math operations
  so that I can calculate numbers

  Background: I have calculator
    Given I have calculator

  @addition
  Scenario: Add two numbers
    When I add 20 and 5 on my calculator
    Then the result should be 25

  @subtraction
  Scenario: Subtract two numbers
    When I subtract 20 and 5
    Then the result should be 15

  @multiplicaiton
   Scenario:Multiply two numbers
     When I multiply 20 and 5
     Then the result should be 100

   @division
   Scenario: Divide two numbers
     When I divide 20 and 5
     Then  the result should be 4





