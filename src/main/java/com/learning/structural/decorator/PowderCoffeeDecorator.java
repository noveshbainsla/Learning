package com.learning.structural.decorator;

public class PowderCoffeeDecorator extends CoffeeDecorator{
    ICoffee coffee;
    PowderCoffeeDecorator(ICoffee coffee){
        this.coffee = coffee;
    }
    @Override
    public Integer charges() {
        return coffee.charges() + 5;
    }

    @Override
    public String description() {
        return coffee.description() + "+Powder";
    }
}
