package org.remote;

public class Light {
    private final String room;

    public Light(String room) {
        this.room = room;
    }

    public void printStatus(){
        System.out.println(room + "light");
    }

    public void on() {
        System.out.println("Light on");
    }

    public void off() {
        System.out.println("Light off");
    }
}
