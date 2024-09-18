package com.learning.behavioral.command;

import com.learning.behavioral.command.commands.Command;

import java.util.List;

public class Calculator {
    private int result;
    private List<Command> pastCommands;

    public Calculator() {
        result = 0;
    }

    public int getResult() {
        return result;
    }

    public void setResult(int result) {
        this.result = result;
    }

    public void executeCommand(Command command) {
        command.execute();
        pastCommands.add(command);
    }
}
