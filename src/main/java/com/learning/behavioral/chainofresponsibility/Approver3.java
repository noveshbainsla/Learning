package com.learning.behavioral.chainofresponsibility;

import java.util.Objects;

public class Approver3 extends AbstractApprover{
    int limit = 20;
    @Override
    public void process(int amount) {
        if(amount <= limit){
            System.out.println("Approved by Approver3.");
        } else if (Objects.nonNull(nextApprover)){
            System.out.println("Approved and moved ahead by Approver3.");
            next(amount);
        } else {
            System.out.println("Rejected by approver3 due to limit");
        }
    }
}
