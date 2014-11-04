Feature: Create a task

  Scenario: Create a new task
    Given I have to prepare my session for Agile Grenoble
    When I create a new task "prepare my session for Agile Grenoble"
    Then I should see my new task "prepare my session for Agile Grenoble" in my list

  Scenario: Create a new task with a due date
    Given I have to prepare my session for Agile Grenoble before the D-Day
    When I create another new task "prepare my session for Agile Grenoble" with the due date "11/20/2014"
    Then I should see my new task "prepare my session for Agile Grenoble" in my list with the due date "11/20/2014"

  Scenario: Create a task with details
    Given I have to prepare and detail my session for Agile Grenoble
    When I create another new task "prepare my session for Agile Grenoble" with the detail "Finish the slide and push the demo to github"
    Then I should see my new task "prepare my session for Agile Grenoble" in my list with the details "Finish the slide and push the demo to github"

  Scenario: Create a task with details and a due date
    Given I have to prepare and detail my session for Agile Grenoble before the D-Day
    When I create a detailed new task "prepare my session for Agile Grenoble" with the detail "Finish the slide and push the demo to github" due before the "11/20/2014"
    Then I should see my new detailed task "prepare my session for Agile Grenoble" in my list with the details "Finish the slide and push the demo to github" and the due date "11/20/2014"