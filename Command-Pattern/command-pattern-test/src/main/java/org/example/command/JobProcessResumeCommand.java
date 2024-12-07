package org.example.command;

import org.example.JobProcess;

public class JobProcessResumeCommand implements Command{
    private final JobProcess jobProcess;

    public JobProcessResumeCommand(JobProcess jobProcess){
        this.jobProcess = jobProcess;
    }

    @Override
    public void execute(){
        jobProcess.resume();
    }

    @Override
    public void undo(){
        jobProcess.suspend();
    }
}
