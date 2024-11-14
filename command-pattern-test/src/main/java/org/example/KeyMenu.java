package org.example;

import java.util.ArrayList;
import java.util.Scanner;
import org.example.command.Command;

public class KeyMenu {
    private ArrayList<String> menu = new ArrayList<>();
    private ArrayList<Command> commands = new ArrayList<>();

    public void addItem(String menu, Command command) {
        this.commands.add(command);
        this.menu.add(menu);
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
        for (int i = 0; i < 4; i++) {
            if (i == x-1) {
                commands.get(i).execute();
            }
        }
    }
}
