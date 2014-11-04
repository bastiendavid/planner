package org.demo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.google.common.collect.Collections2;

public class TaskList {

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

    public void createNewTask(String name, String details, Date dueDate) {
        Task task = new Task(name, details, dueDate);
        tasks.add(task);
    }
}
