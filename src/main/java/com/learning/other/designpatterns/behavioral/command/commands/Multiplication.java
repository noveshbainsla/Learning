package com.learning.other.designpatterns.behavioral.command.commands;

import com.learning.other.designpatterns.behavioral.command.Calculator;

public class Multiplication implements Command{
    private final Calculator calculator;
    private final int number;

    public Multiplication(Calculator calculator, int number) {
        this.calculator = calculator;
        this.number = number;
    }

    @Override
    public void execute() {
        calculator.setResult(calculator.getResult() * number);
    }
}
