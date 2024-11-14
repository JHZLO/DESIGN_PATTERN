package org.example;

import org.example.command.JobProcessResumeCommand;
import org.example.command.JobProcessStartCommand;
import org.example.command.JobProcessStopCommand;
import org.example.command.JobProcessSuspendCommand;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, Command!");

        KeyMenu keyMenu = new KeyMenu();
        JobProcess jobProcess = new JobProcess();
        SimpleProcess simpleProcess = new SimpleProcess();
        keyMenu.addItem("1. Start", new JobProcessStartCommand(jobProcess));
        keyMenu.addItem("2. Stop", new JobProcessStopCommand(jobProcess));
        keyMenu.addItem("3. Suspend", new JobProcessSuspendCommand(jobProcess));
        keyMenu.addItem("4. Resume", new JobProcessResumeCommand(jobProcess));
        keyMenu.menu();
    }
}
