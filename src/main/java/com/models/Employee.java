package com.models;

public class Employee {

    private String name;
    private Position position;

    public String getName() {
        return name;
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    public Employee(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        String salary = String.valueOf(position.getSalary().getValueInBYN());
        return String.format("Employee: %s has position - %s with salary - %s BYN", name, position, salary);
    }
}
