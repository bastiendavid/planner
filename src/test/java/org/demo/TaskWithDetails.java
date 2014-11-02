package org.demo;

import org.fest.assertions.api.Assertions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class TaskWithDetails {

    private TaskList list;

    @Given("^I have to prepare and detail my session for Agile Grenoble$")
    public void i_have_to_prepare_and_detail_my_session_for_Agile_Grenoble() throws Throwable {
        list = new TaskList();
    }

    @When("^I create another new task \"(.*?)\" with the detail \"(.*?)\"$")
    public void i_create_another_new_task_with_the_detail(String taskName, String details) throws Throwable {
        list.createNewTask(taskName, details);
    }

    @Then("^I should see my new task \"(.*?)\" in my list with the details \"(.*?)\"$")
    public void i_should_see_my_new_task_in_my_list_with_the_details(String taskName, String details) throws Throwable {
        Assertions.assertThat(list.hasTask(taskName)).isTrue();
        Assertions.assertThat(list.taskWithName(taskName).details()).isEqualTo(details);
    }
}
