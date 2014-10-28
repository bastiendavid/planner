Feature: Create a task
  Scenario: Create a new task
    Given I have to prepare my session for Agile Grenoble
    When I create a new task "prepare my session for Agile Grenoble"
    Then I should see my new task "prepare my session for Agile Grenoble" in my list
