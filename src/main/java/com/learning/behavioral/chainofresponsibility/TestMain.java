package com.learning.behavioral.chainofresponsibility;

import java.util.PriorityQueue;

public class TestMain {
    public static void main(String[] args) {
        Approver1 approver1 = new Approver1();
        Approver2 approver2 = new Approver2();
        Approver3 approver3 = new Approver3();

        approver1.setNextApprover(approver2);
        approver2.setNextApprover(approver3);

        approver1.process(22);

//        Following is the if else based alternative, and this is just 3 steps
//        int amount = 22;
//        if(amount < approver1.limit){
//            System.out.println("approved by 1");
//        }else{
//            if(amount < approver2.limit){
//                System.out.println("approved by 2");
//            }else {
//                if(amount < approver3.limit){
//                    System.out.println("approved by 3");
//                }else {
//                    System.out.println("limit breached.");
//                }
//            }
//        }
    }
}
