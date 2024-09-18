package com.learning.behavioral.StrategyPattern;

import java.util.HashMap;
import java.util.Map;
import java.util.Queue;

public class TestMain {
 /*the benefit with this pattern is that you can hold your payment concrete as an object of
 PaymentStrategy interface and after that point it is generic code, for adding any new payment
    method all you need to do is create new payment strategy impl and add that to payment method resolution logic.
   ******* map.get(paymentmode).pay(amount) vs if else logic **********

    However if you were to use a single class for payment with different payment mode functions in it then in client logic
    you have to add if else every time you add new method and also you will need to modify your existing payment class defying
    single responsibility principle and it will keep on increasing endlessly.

    if you were to use separate classes but no interface like PaymentStrategy then in client code ( where you call pay method )
    you will couple your code tightly with the implementations i.e. if("UPI") => new UPIPayment().pay(amount) else.....and so on.
  */
    public static void main(String[] args) {
        String paymentMode = "UPI";
        Map<String, PaymentStrategy> paymentStrategyMap = new HashMap<>();
        initializePaymentStrategyMap(paymentStrategyMap);

        paymentStrategyMap.get(paymentMode).pay(5000);
        paymentStrategyMap.get("CC").pay(5000);
        Queue<Integer> queue;
    }

    private static void initializePaymentStrategyMap(Map<String, PaymentStrategy> paymentStrategyMap) {
        paymentStrategyMap.put("CC", new CreditCardPayment());
        paymentStrategyMap.put("UPI", new UPIPayment());
    }
}
