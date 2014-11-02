package org.demo;

import java.util.Date;

import org.fest.assertions.api.Assertions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class TaskWithDueDateSteps {

    private TaskList list;

    @Given("^I have to prepare my session for Agile Grenoble before the D-Day$")
    public void i_have_to_prepare_my_session_for_Agile_Grenoble_before_the_D_Day() throws Throwable {
        list = new TaskList();
    }

    @When("^I create another new task \"(.*?)\" with the due date \"(.*?)\"$")
    public void i_create_another_new_task_with_the_due_date(String taskName, Date dueDate) throws Throwable {
        list.createNewTask(taskName, dueDate);
    }

    @Then("^I should see my new task \"(.*?)\" in my list with the due date \"(.*?)\"$")
    public void i_should_see_my_new_task_in_my_list_with_the_due_date(String taskName, Date dueDate) throws Throwable {
        Assertions.assertThat(list.hasTask(taskName)).isTrue();
        Assertions.assertThat(list.taskWithName(taskName).dueDate()).isEqualTo(dueDate);
    }
}
