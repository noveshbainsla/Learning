package com.learning.structural.decorator;

public class Coffee implements ICoffee{
    Integer charges = 100;
    @Override
    public Integer charges() {
        return charges;
    }

    @Override
    public String description() {
        return "Coffee";
    }
}
