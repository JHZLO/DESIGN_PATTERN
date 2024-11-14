package org.example;

public class Worker {
    private Boolean isBusy = false;

    public void assignJob() {
        System.out.println("Job Assigned");
    }

    public void jobDone() {
        System.out.println("Job Done");
    }

    public Boolean isJobAssigned() {
        return isBusy;
    }
}
