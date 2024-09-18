package com.learning.behavioral.chainofresponsibility;

import java.util.Objects;

public abstract class AbstractApprover {
    AbstractApprover nextApprover;
    public abstract void process(int amount);
    public void setNextApprover(AbstractApprover nextApprover){
        this.nextApprover = nextApprover;
    }
    public void next(int amount){
        if (Objects.nonNull(nextApprover)) nextApprover.process(amount);
    }
}
