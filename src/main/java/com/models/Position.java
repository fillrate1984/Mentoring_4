package com.models;

public class Position {

    private String name;
    private Salary salary;

    public Position(String name, Salary salary) {
        this.salary = salary;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Salary getSalary() {
        return salary;
    }

    public void setSalary(Salary salary) {
        this.salary = salary;
    }
}
