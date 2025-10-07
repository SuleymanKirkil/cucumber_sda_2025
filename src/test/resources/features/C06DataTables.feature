@addTodo
Feature: todo list feature

  @ToDoList
  Scenario: we can add new todos
    Given user goes to url "https://webdriveruniversity.com/To-Do-List/index.html"
    When user enters new todos
      | Prepare Breakfast        |
      | Wash the dishes          |
      | Take care of baby        |
      | Help your kid's homework |
      | Study Selenium           |
      | Sleep                    |
      | Get Up                   |
      | Go to school             |
    Then user closes the browser