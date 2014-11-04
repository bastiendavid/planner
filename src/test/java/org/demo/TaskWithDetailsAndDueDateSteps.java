package org.demo;

import java.util.Date;

import org.fest.assertions.api.Assertions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class TaskWithDetailsAndDueDateSteps {

    private TaskList list;

    @Given("^I have to prepare and detail my session for Agile Grenoble before the D-Day$")
    public void i_have_to_prepare_and_detail_my_session_for_Agile_Grenoble_before_the_D_Day() throws Throwable {
        list = new TaskList();
    }

    @When("^I create a detailed new task \"(.*?)\" with the detail \"(.*?)\" due before the \"(.*?)\"$")
    public void i_create_a_detailed_new_task_with_the_detail_due_before_the(String taskName, String details, Date dueDate) throws Throwable {
        list.createNewTask(taskName, details, dueDate);
    }

    @Then("^I should see my new detailed task \"(.*?)\" in my list with the details \"(.*?)\" and the due date \"(.*?)\"$")
    public void i_should_see_my_new_detailed_task_in_my_list_with_the_details_and_the_due_date(String taskName, String details, Date dueDate) throws Throwable {
        Assertions.assertThat(list.hasTask(taskName)).isTrue();
        Task task = list.taskWithName(taskName);
        Assertions.assertThat(task.details()).isEqualTo(details);
        Assertions.assertThat(task.dueDate()).isEqualTo(dueDate);
    }
}
