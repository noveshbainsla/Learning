package com.learning.behavioral.mementoOrSnapshot;

import java.util.Stack;

public class BoardCareTaker {
    private Stack<TicTacToeBoard.TicTacToeSnapShot> snapShots = new Stack<>();


    // this particular function can be moved to a command pattern
    // and we can store stack of commands instead of snapshots and command will have a snapshot of the board
    public void move(TicTacToeBoard board, String place, Character value) {
        snapShots.push(board.createSnapShot());
        if(place == "a0") {
            board.setA0(value);
        } else if(place == "a1") {
            board.setA1(value);
        } else if(place == "a2") {
            board.setA2(value);
        } else if(place == "b0") {
            board.setB0(value);
        } else if(place == "b1") {
            board.setB1(value);
        } else if(place == "b2") {
            board.setB2(value);
        } else if(place == "c0") {
            board.setC0(value);
        } else if(place == "c1") {
            board.setC1(value);
        } else if(place == "c2") {
            board.setC2(value);
        } else {
            throw new IllegalArgumentException("Invalid place");
        }
    }

    public void undo(TicTacToeBoard board) {
        if(!snapShots.isEmpty()) {
            TicTacToeBoard.TicTacToeSnapShot pop = snapShots.pop();
            board.restoreSnapshot(pop);
        }
    }
}
