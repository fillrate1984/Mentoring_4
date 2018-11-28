package com.services;

import com.models.Position;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.HashMap;

@Component
public class PositionService {

    private HashMap<String, Position> positions = new HashMap<>();

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
        return new ArrayList<>(positions.values());
    }
}
