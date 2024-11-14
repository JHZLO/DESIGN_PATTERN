package org.example;

public class JobProcess implements Process {
    @Override
    public void start() {
        System.out.println("Start Job");
    }

    @Override
    public void stop() {
        System.out.println("Stop Job");
    }

    public void suspend() {
        System.out.println("Suspend Job");
    }

    public void resume() {
        System.out.println("Resume Job");
    }
}
