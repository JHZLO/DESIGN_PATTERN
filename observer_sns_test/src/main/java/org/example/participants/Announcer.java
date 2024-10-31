package org.example.participants;

public class Announcer extends Participant {
    private String name;
    private String buffer = "announce";

    public Announcer(String name) {
        super(name);
    }

    @Override
    public String toString() {
        return "[" + name + "]" + "\n" + buffer + "\n";
    }
}
