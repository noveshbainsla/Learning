package com.learning.structural.decorator;

public class SugarCoffeeDecorator extends CoffeeDecorator{
    ICoffee coffee;
    Integer sugarCharges = 10;
    SugarCoffeeDecorator(ICoffee coffee){
        this.coffee = coffee;
    }

    @Override
    public Integer charges() {
        return coffee.charges() + sugarCharges;
    }

    @Override
    public String description() {
        return coffee.description() + "+Sugar";
    }
}
