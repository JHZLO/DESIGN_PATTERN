package org.example.command;

import org.example.JobProcess;

public class JobProcessSuspendCommand implements Command{
    private final JobProcess jobProcess;

    public JobProcessSuspendCommand(JobProcess jobProcess){
        this.jobProcess = jobProcess;
    }

    @Override
    public void execute(){
        jobProcess.suspend();
    }

}
