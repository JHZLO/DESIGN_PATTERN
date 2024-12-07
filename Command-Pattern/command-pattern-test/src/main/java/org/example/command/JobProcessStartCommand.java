package org.example.command;

import org.example.JobProcess;

public class JobProcessStartCommand implements Command{
    private final JobProcess jobProcess;

    public JobProcessStartCommand(JobProcess jobProcess){
        this.jobProcess = jobProcess;
    }

    @Override
    public void execute(){
        jobProcess.start();
    }

    @Override
    public void undo(){
        jobProcess.stop();
    }
}
