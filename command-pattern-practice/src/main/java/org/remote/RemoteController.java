package org.remote;

public class RemoteController {
    private Command slot;

    public RemoteController(){}

    public void setCommand(Command command){
        slot = command;
    }

    public void wasPressedButton(){
        slot.execute();
    }
}
