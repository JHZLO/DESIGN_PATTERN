package org.example.command;

import org.example.SimpleProcess;

public class SimpleProcessStopCommand implements Command{
    private final SimpleProcess simpleProcess;

    public SimpleProcessStopCommand(SimpleProcess simpleProcess){
        this.simpleProcess = simpleProcess;
    }

    @Override
    public void execute(){
        simpleProcess.stop();
    }

    @Override
    public void undo(){
        simpleProcess.start();
    }
}
