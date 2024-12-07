package org.example;

public class SimpleProcess implements Process {
    @Override
    public void start() {
        System.out.println("Start Process");
    }

    @Override
    public void stop() {
        System.out.println("Stop Process");
    }
}
