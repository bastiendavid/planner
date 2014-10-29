Feature: Create a task
  Scenario: Create a new task
    Given I have to prepare my session for Agile Grenoble
    When I create a new task "prepare my session for Agile Grenoble"
    Then I should see my new task "prepare my session for Agile Grenoble" in my list
  
  Scenario: Create a new task with a due date
    Given I have to prepare my session for Agile Grenoble before the D-Day
    When I create another new task "prepare my session for Agile Grenoble" with the due date "11/20/2014"
    Then I should see my new task "prepare my session for Agile Grenoble" in my list with the due date "11/20/2014"
