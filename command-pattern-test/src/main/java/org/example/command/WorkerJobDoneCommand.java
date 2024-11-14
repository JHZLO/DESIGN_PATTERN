package org.example.command;

import org.example.Worker;

public class WorkerJobDoneCommand implements Command{
    private final Worker worker;

    public WorkerJobDoneCommand(Worker worker){
        this.worker = worker;
    }

    @Override
    public void execute(){
        worker.jobDone();
    }

    @Override
    public void undo(){
        worker.assignJob();
    }
}
