package com.models;

import java.util.ArrayList;
import java.util.HashMap;

public class Position {

    private static HashMap<String, Position> positions = new HashMap<String, Position>();
    private String name;
    private Salary salary;

    public Position(String name, Salary salary) {
        this.salary = salary;
        positions.put(name, this);
    }

    public Position getPosition(String name) {
        return positions.get(name);
    }

    public ArrayList<Position> getPositions() {
        return new ArrayList<Position>(positions.values());
    }

}
