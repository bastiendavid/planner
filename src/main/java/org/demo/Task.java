package org.demo;

import java.util.Date;

public class Task {

    private String name;
    private Date dueDate;

    public Task(String name) {
        this.name = name;
    }

    public Task(String name, Date dueDate) {
        this.name = name;
        this.dueDate = dueDate;
    }

    public String name() {
        return name;
    }

    public Date dueDate() {
        return dueDate;
    }
}
