package com.services;

import com.models.Position;

import java.util.ArrayList;
import java.util.HashMap;

public class PositionService {

    private HashMap<String, Position> positions = new HashMap<String, Position>();

    public void addPosition(Position position) {
        positions.put(position.getName(), position);
    }

    public void removePosition(Position position) {
        positions.remove(position.getName());
    }

    public Position getByName(String name) {
        return positions.get(name);
    }

    public ArrayList<Position> getPositionsList() {
        return new ArrayList<Position>(positions.values());
    }
}
