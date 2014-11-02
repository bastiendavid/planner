package org.demo;

import com.google.common.base.Predicate;

class TaskWithNamePredicate implements Predicate<Task> {
    private final String taskName;

    public TaskWithNamePredicate(String taskName) {
        this.taskName = taskName;
    }

    public boolean apply(Task task) {
        return task.name().equals(taskName);
    }
}