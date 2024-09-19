package com.learning.behavioral.mementoOrSnapshot;

/*
    Memento design pattern:
    Lets you save and restore the previous state of an object without revealing the details of its implementation.
    This has three main classes:
    Originator: the object that has the state and can create the memento object.
    Memento: the object that stores the state of the originator.
    Caretaker: the object that stores the memento object and can restore the state of the originator.

    In this example Originator is tic-tac-toe game board,
    Memento is the snapshot of the board after a particular move.
    GameCareTaker is the caretaker that stores the history of the board as memento objects.

    This pattern is useful when we want to store the state of an object and restore it later.
    Such that state is not exposed to the client and only the originator can access it.

    In this example originator class i.e. TicTacToeBoard has a method to create a snapshot of the board and restore the board from the snapshot.
    so only TicTacToeBoard can access the state of the board.
    Caretaker keeps the snapshot but does not have access to the state of the board.
 */
public class TestMain {
    public static void main(String[] args) {
        TicTacToeBoard ticTacToeBoard = new TicTacToeBoard();
        BoardCareTaker boardCareTaker = new BoardCareTaker();

        boardCareTaker.move(ticTacToeBoard, "a0", 'O');
        boardCareTaker.move(ticTacToeBoard, "a1", 'X');
        boardCareTaker.move(ticTacToeBoard, "a2", 'O');
        System.out.println(ticTacToeBoard);

        boardCareTaker.undo(ticTacToeBoard);
        System.out.println(ticTacToeBoard);

        boardCareTaker.undo(ticTacToeBoard);
        System.out.println(ticTacToeBoard);
    }
}
