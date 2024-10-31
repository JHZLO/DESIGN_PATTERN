package org.example.participants;

public class Monitor extends Participant{
    private String name;
    private String buffer = null;

    public Monitor(String name) {
        super(name);
    }

    @Override
    public String toString() {
        return "";
    }
}
