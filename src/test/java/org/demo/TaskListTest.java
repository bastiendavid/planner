package org.demo;

import org.fest.assertions.api.Assertions;
import org.junit.Test;

public class TaskListTest {

    @Test
    public void get_a_task_by_name() throws Exception {

        // Given
        String taskName = "New task";
        TaskList list = new TaskList();
        list.createNewTask(taskName);

        // When
        Task taskWithName = list.taskWithName(taskName);

        // Then
        Assertions.assertThat(taskWithName).isNotNull();
        Assertions.assertThat(taskWithName.name()).isEqualTo(taskName);
    }
}
