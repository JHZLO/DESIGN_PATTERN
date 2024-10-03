package org.network.src.model;

import org.network.src.model.strategies.availability.Availability;

public class DirectLine {
    private final String name;
    private final Availability availability;

    public DirectLine(String name, Availability availability) {
        this.name = name;
        this.availability = availability;
    }

    public boolean isAvailable() {
        return availability.isAvailable();
    }

    public void printAvailable(){
        availability.printAvailable();
    }

    public String getName() {
        return name;
    }
}
