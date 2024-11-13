package org.remote;

public class Main {
    public static void main(String[] args) {
        RemoteController remoteController = new RemoteController();

        Light livingRoomLight = new Light("Living Room");
        Light kitchenLight = new Light("Kitchen");
        Stereo stereo = new Stereo();

        LightOnCommand livingRoomLightOnCommand = new LightOnCommand(livingRoomLight);
        LightOffCommand livingRoomLightOffCommand = new LightOffCommand(livingRoomLight);

        LightOnCommand kitchenLightOnCommand = new LightOnCommand(kitchenLight);
        LightOffCommand kitchenLightOffCommand = new LightOffCommand(kitchenLight);

        StereoOnWithCDCommand stereoOnWithCDCommand = new StereoOnWithCDCommand(stereo);

        remoteController.setCommand(0, livingRoomLightOnCommand, livingRoomLightOffCommand);
        remoteController.setCommand(1, kitchenLightOnCommand, kitchenLightOffCommand);
        remoteController.setCommand(2, stereoOnWithCDCommand, stereoOnWithCDCommand);

        remoteController.onButtonWasPushed(0);
        remoteController.offButtonWasPushed(0);
        remoteController.onButtonWasPushed(1);
        remoteController.offButtonWasPushed(1);

        remoteController.onButtonWasPushed(2);

    }
}
