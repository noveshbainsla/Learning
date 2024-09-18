package com.learning.behavioral.command.commands;

import com.learning.behavioral.command.Calculator;

public class Addition implements Command{
    private final Calculator calculator;
    private final int number;

    public Addition(Calculator calculator, int number) {
        this.calculator = calculator;
        this.number = number;
    }

    @Override
    public void execute() {
        calculator.setResult(calculator.getResult() + number);
    }
}
