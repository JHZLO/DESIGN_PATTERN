package org.example.command;

import org.example.command.Command;

public class MacroCommand implements Command {
    private final Command[] commands;

    public MacroCommand(Command[] commands){
        this.commands = commands;
    }

    @Override
    public void execute(){
        for (int i = 0; i < commands.length; i++) {
            commands[i].execute();
        }
    }

    @Override
    public void undo(){

    }
}
