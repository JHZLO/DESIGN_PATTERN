package org.example.command;

import org.example.JobProcess;

public class JobProcessStopCommand implements Command{
    private final JobProcess jobProcess;

    public JobProcessStopCommand(JobProcess jobProcess){
        this.jobProcess = jobProcess;
    }

    @Override
    public void execute(){
        jobProcess.stop();
    }

    @Override
    public void undo(){
        jobProcess.start();
    }
}
