package org.example;

import java.util.ArrayList;
import java.util.Scanner;
import org.example.command.Command;
import org.example.command.NoCommand;

public class KeyMenu {
    private ArrayList<String> menu = new ArrayList<>();
    private ArrayList<Command> startCommands = new ArrayList<>();
    private ArrayList<Command> stopCommands = new ArrayList<>();
    private Command undoCommand = new NoCommand();

    public void addItem(String menu, Command startCommand, Command stopCommand) {
        this.menu.add(menu);
        this.startCommands.add(startCommand);
        this.stopCommands.add(stopCommand);
    }

    public void showMenu() {
        for (String item : menu) {
            System.out.println(item);
        }
    }

    public int getKeyValue() {
        @SuppressWarnings("resource")
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        if (x < 0 || x > menu.size()) {
            System.out.println("Invalid key pressed");
            return -1;
        } else {
            return x;
        }
    }

    public void menu() {
        showMenu();
        System.out.println("\nEnter your choice: ");
        int x = getKeyValue();
        executeCommand(x);
    }

    private void executeCommand(int x) {
        for (int i = 0; i < startCommands.size(); i++) {
            if (i == x-1) {
                executeStartCommand(i);
                executeStopCommand(i);
            }
        }
        if(x == 0){
            undoCommand();
        }
    }

    private void executeStopCommand(final int i) {
        stopCommands.get(i).execute();
        undoCommand = stopCommands.get(i);
    }

    private void executeStartCommand(final int i) {
        startCommands.get(i).execute();
        undoCommand = startCommands.get(i);
    }

    private void undoCommand(){
        System.out.println("작업을 취소합니다.");
        undoButtonWasPushed();
    }

    public void undoButtonWasPushed(){
        undoCommand.undo(); // 마지막으로 했던 작업 취소
    }
}
