package com.learning.behavioral.command.commands;

import com.learning.behavioral.command.Calculator;

public class Division implements Command{
    private final Calculator calculator;
    private final int number;

    public Division(Calculator calculator, int number) {
        this.calculator = calculator;
        this.number = number;
    }

    @Override
    public void execute() {
        if (number == 0) {
            throw new IllegalArgumentException("Cannot divide by zero");
        }
        calculator.setResult(calculator.getResult() / number);
    }
}
