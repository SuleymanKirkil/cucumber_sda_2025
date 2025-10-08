Feature: Data Table Samples
  @DataTAbleList
  Scenario: Using Data Table as List
    Given user goes to url "https://testpages.eviltester.com/styled/basic-html-form-test.html"
    And user select following items from multi-select:
      | Selection Item 1 |
      | Selection Item 2 |
      | Selection Item 3 |
      | Selection Item 4 |
    Then user verifies all items should be selected

  @FormListOfList
  Scenario: Form Page List
    Given user goes to url "https://testpages.eviltester.com/styled/basic-html-form-test.html"
    When user enters username password and comment
      | john_doe | 1234 | Hello John   |
      | tom_zoey | 5678 | Hi, everyone |
      | Mary_Lee | 563  | Whats up     |
    Then user closes the browser

  @FormListOfMaps
  Scenario: Form Page List With Title
    Given user goes to url "https://testpages.eviltester.com/styled/basic-html-form-test.html"
    When user enters username password and comment with heading
      | name     | pass | comm         |
      | john_doe | 1234 | Hello John   |
      | tom_zoey | 5678 | Hi, everyone |
      | Mary_Lee | 563  | Whats up     |
    Then user closes the browser

  @FormOfMap
  Scenario: Form Page List With Title
    Given user goes to url "https://testpages.eviltester.com/styled/basic-html-form-test.html"
    When user fills the form with
      | name | john_doe |
      | pass | 1234 |
      | comm | Hi, everyone |
    Then user closes the browser