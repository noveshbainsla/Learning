package com.learning.behavioral.StrategyPattern;

public class PaymentProcessor {
    public PaymentProcessor(){}

    public void pay(int amount, PaymentStrategy paymentStrategy){
        paymentStrategy.pay(amount);
    }
}
