package org.demo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.google.common.base.Predicate;
import com.google.common.collect.Collections2;

public class TaskList {

    private class TaskWithNamePredicate implements Predicate<Task> {
        private String taskName;

        public TaskWithNamePredicate(String taskName) {
            this.taskName = taskName;
        }

        public boolean apply(Task task) {
            return task.name().equals(taskName);
        }
    }

    private List<Task> tasks = new ArrayList<Task>();

    public void createNewTask(String taskName) {
        Task task = new Task(taskName);
        tasks.add(task);
    }

    public boolean hasTask(String taskName) {
        return !Collections2.filter(tasks, new TaskWithNamePredicate(taskName)).isEmpty();
    }

    public void createNewTask(String taskName, Date dueDate) {
        Task task = new Task(taskName, dueDate);
        tasks.add(task);
    }

    public void createNewTask(String taskName, String details) {
        Task task = new Task(taskName, details);
        tasks.add(task);
    }

    public Task taskWithName(String name) {
        return Collections2.filter(tasks, new TaskWithNamePredicate(name)).iterator().next();
    }
}
