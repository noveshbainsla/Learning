package com.learning.behavioral.chainofresponsibility;

import java.util.Objects;

public class Approver1 extends AbstractApprover{
    int limit = 10;
    @Override
    public void process(int amount) {
        if(amount <= limit){
            System.out.println("Approved by Approver1.");
        } else if(Objects.nonNull(nextApprover)) {
            System.out.println("Approved and moved ahead by Approver1.");
            next(amount);
        } else {
            System.out.println("Rejected by approver1 due to limit");
        }
    }
}
