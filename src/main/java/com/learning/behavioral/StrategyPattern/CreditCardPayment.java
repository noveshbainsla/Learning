package com.learning.behavioral.StrategyPattern;

public class CreditCardPayment implements PaymentStrategy {
    @Override
    public void pay(Integer amount) {
        System.out.println("payed via credit card - " + amount);
    }
}
