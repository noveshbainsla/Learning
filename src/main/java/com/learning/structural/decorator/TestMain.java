package com.learning.structural.decorator;

public class TestMain {
//    Every Decorator class implements ICoffee ( base object ) interface
//    create base object
//    to add a specific functionality use decorator, which internally holds another ICoffee object
//    and so on any decorator can be used in any order and every decorator adds it's own logic and becomes
//    decorated implementation of ICoffee.
    public static void main(String[] args) {
        ICoffee coffee = new Coffee();
        coffee = new MilkCoffeeDecorator(coffee);
        coffee = new PowderCoffeeDecorator(coffee);
        coffee = new SugarCoffeeDecorator(coffee);
        System.out.println(coffee.charges());
        System.out.println(coffee.description());
    }
}
