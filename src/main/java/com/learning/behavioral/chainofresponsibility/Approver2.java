package com.learning.behavioral.chainofresponsibility;

import java.util.Objects;

public class Approver2 extends AbstractApprover{
    int limit = 15;
    @Override
    public void process(int amount) {
        if(amount <= limit){
            System.out.println("Approved by Approver2.");
        } else if(Objects.nonNull(nextApprover)) {
            System.out.println("Approved and moved ahead by Approver2.");
            next(amount);
        } else {
            System.out.println("Rejected by approver2 due to limit");
        }
    }
}
