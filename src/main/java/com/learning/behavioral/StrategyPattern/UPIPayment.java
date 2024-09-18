package com.learning.behavioral.StrategyPattern;

public class UPIPayment implements PaymentStrategy{

    @Override
    public void pay(Integer amount) {
        System.out.println("payed by UPI - " + amount);
    }
}
