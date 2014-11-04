package org.demo;

import java.util.Date;

public class Task {

    private String name;
    private Date dueDate;
    private String details;

    public Task(String name) {
        this.name = name;
    }

    public Task(String name, Date dueDate) {
        this.name = name;
        this.dueDate = dueDate;
    }

    public Task(String name, String details) {
        this.name = name;
        this.details = details;
    }

    public Task(String name, String details, Date dueDate) {
        this.name = name;
        this.details = details;
        this.dueDate = dueDate;
    }

    public String name() {
        return name;
    }

    public Date dueDate() {
        return dueDate;
    }

    public String details() {
        return details;
    }
}
