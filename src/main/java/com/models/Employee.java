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
}
