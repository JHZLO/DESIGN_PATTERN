package org.example;

import java.util.ArrayList;
import java.util.Scanner;
import org.example.command.Command;
import org.example.command.JobProcessResumeCommand;
import org.example.command.JobProcessStartCommand;
import org.example.command.JobProcessStopCommand;
import org.example.command.JobProcessSuspendCommand;
import org.example.command.MacroCommand;
import org.example.command.NoCommand;
import org.example.command.SimpleProcessStartCommand;
import org.example.command.SimpleProcessStopCommand;
import org.example.command.WorkerAssginJobCommand;
import org.example.command.WorkerJobDoneCommand;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);


        KeyMenu keyMenu = new KeyMenu();
        JobProcess jobProcess = new JobProcess();
        SimpleProcess simpleProcess = new SimpleProcess();
        Worker worker = new Worker();

        keyMenu.addItem("1. Job Process Start / Job Process Stop", new JobProcessStartCommand(jobProcess), new JobProcessStopCommand(jobProcess));
        keyMenu.addItem("2. Job Process Resume / Job Process Suspend",  new JobProcessResumeCommand(jobProcess), new JobProcessSuspendCommand(jobProcess));
        keyMenu.addItem("3. Simple Process Start / Simple Process Stop", new SimpleProcessStartCommand(simpleProcess), new SimpleProcessStopCommand(simpleProcess));
        keyMenu.addItem("4. Worker Assgin Job / Worker Job Done", new WorkerAssginJobCommand(worker), new WorkerJobDoneCommand(worker));

        JobProcessStartCommand jobProcessStartCommand = new JobProcessStartCommand(jobProcess);
        JobProcessResumeCommand jobProcessResumeCommand = new JobProcessResumeCommand(jobProcess);
        JobProcessSuspendCommand jobProcessSuspendCommand = new JobProcessSuspendCommand(jobProcess);
        JobProcessStopCommand jobProcessStopCommand = new JobProcessStopCommand(jobProcess);

        ArrayList<Command> jobProcessMacroCommands = new ArrayList<>();
        jobProcessMacroCommands.add(jobProcessStartCommand);
        jobProcessMacroCommands.add(jobProcessResumeCommand);
        jobProcessMacroCommands.add(jobProcessSuspendCommand);
        jobProcessMacroCommands.add(jobProcessStopCommand);
        MacroCommand jobProcessMacro = new MacroCommand(jobProcessMacroCommands.toArray(new Command[0]));
        keyMenu.addItem("5. JobProcessMacro", jobProcessMacro, new NoCommand());

        while (true){
            System.out.println("Hello, Command!");
            System.out.println("0. 작업 되돌리기 버튼");
            keyMenu.menu();
            System.out.println("종료하시겠습니까? (예:Y, 아니오:N)" );
            String input = scanner.next();
            if(input.equals("Y")){
                break;
            }
        }
    }
}
