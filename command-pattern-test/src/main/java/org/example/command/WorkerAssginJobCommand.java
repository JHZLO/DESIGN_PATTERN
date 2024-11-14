package org.example.command;

import org.example.Worker;

public class WorkerAssginJobCommand implements Command{
    private final Worker worker;

    public WorkerAssginJobCommand(Worker worker){
        this.worker = worker;
    }

    @Override
    public void execute(){
        worker.assignJob();
    }

    @Override
    public void undo(){
        worker.jobDone();
    }
}
