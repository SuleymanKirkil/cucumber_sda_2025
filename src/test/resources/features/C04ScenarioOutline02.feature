Feature: Form test Feature
  @FormScenario
  Scenario Outline: Form Test
    Given user goes to url "https://testpages.eviltester.com/styled/basic-html-form-test.html"
    When user enters form username "<username>"
    And user enters form password "<password>"
    And user enters form comment "<comment>"
    And user clicks on form submit
    Then user validates comment include "<comment>"
    Then user closes the browser
    Examples:
      | username  | password | comment        |
      | john-doe  | a123     | Hello John     |
      | mary-lue  | xyz3     | Hello Marry    |
      | Good-luck | happy6   | Hello GoodLuck |
