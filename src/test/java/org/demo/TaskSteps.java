package org.demo;

import org.fest.assertions.api.Assertions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class TaskSteps {
    private TaskList list;

    @Given("^I have to prepare my session for Agile Grenoble$")
    public void i_have_to_prepare_my_session_for_Agile_Grenoble() throws Throwable {
        list = new TaskList();
    }

    @When("^I create a new task \"(.*?)\"$")
    public void i_create_a_new_task(String taskName) throws Throwable {
        list.createNewTask(taskName);
    }

    @Then("^I should see my new task \"(.*?)\" in my list$")
    public void i_should_see_my_new_task_in_my_list(String taskName) throws Throwable {
        Assertions.assertThat(list.hasTask(taskName)).isTrue();
    }
}
