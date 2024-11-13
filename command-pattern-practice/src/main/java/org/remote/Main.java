package org.remote;

public class Main {
    public static void main(String[] args) {
        RemoteController remoteController = new RemoteController();

        Light light = new Light();

        remoteController.setCommand(new LightOnCommand(light));

        remoteController.wasPressedButton();
    }
}
