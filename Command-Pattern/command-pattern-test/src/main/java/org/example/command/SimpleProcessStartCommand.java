package org.example.command;

import org.example.SimpleProcess;

public class SimpleProcessStartCommand implements Command{
    private final SimpleProcess simpleProcess;

    public SimpleProcessStartCommand(SimpleProcess simpleProcess){
        this.simpleProcess = simpleProcess;
    }

    @Override
    public void execute(){
        simpleProcess.start();
    }

    @Override
    public void undo(){
        simpleProcess.stop();
    }
}
