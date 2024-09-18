package com.learning.structural.decorator;

public class MilkCoffeeDecorator extends CoffeeDecorator{
    ICoffee coffee;
    Integer milkCharges = 20;
    MilkCoffeeDecorator(ICoffee coffee){
        this.coffee = coffee;
    }
    @Override
    public Integer charges() {
        return coffee.charges() + milkCharges;
    }

    @Override
    public String description() {
        return coffee.description() + "+Milk";
    }
}
