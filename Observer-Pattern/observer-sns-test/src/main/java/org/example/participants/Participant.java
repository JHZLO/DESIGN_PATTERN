package org.example.participants;

public class Participant{
    private final String name;
    private String buffer = "";

    public Participant(String name) {
        this.name = name;
    }

    public void inputln(String line) {
        buffer += line;
        buffer += "\n";
    }

    public String getName() {
        return name;
    }
}
