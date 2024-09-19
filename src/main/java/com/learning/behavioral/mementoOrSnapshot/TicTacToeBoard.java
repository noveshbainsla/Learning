package com.learning.behavioral.mementoOrSnapshot;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class TicTacToeBoard {
    private Character a0;
    private Character a1;
    private Character a2;
    private Character b0;
    private Character b1;
    private Character b2;
    private Character c0;
    private Character c1;
    private Character c2;

    public TicTacToeSnapShot createSnapShot() {
        return new TicTacToeSnapShot(a0, a1, a2, b0, b1, b2, c0, c1, c2);
    }

    @Override
    public String toString() {
        return a0 + " " + a1 + " " + a2 + "\n" + b0 + " " + b1 + " " + b2 + "\n" + c0 + " " + c1 + " " + c2;
    }

    public void restoreSnapshot(TicTacToeSnapShot ticTacToeSnapShot) {
        this.a0 = ticTacToeSnapShot.a0;
        this.a1 = ticTacToeSnapShot.a1;
        this.a2 = ticTacToeSnapShot.a2;
        this.b0 = ticTacToeSnapShot.b0;
        this.b1 = ticTacToeSnapShot.b1;
        this.b2 = ticTacToeSnapShot.b2;
        this.c0 = ticTacToeSnapShot.c0;
        this.c1 = ticTacToeSnapShot.c1;
        this.c2 = ticTacToeSnapShot.c2;
    }

    static class TicTacToeSnapShot {
        private Character a0;
        private Character a1;
        private Character a2;
        private Character b0;
        private Character b1;
        private Character b2;
        private Character c0;
        private Character c1;
        private Character c2;

        public TicTacToeSnapShot(Character a0, Character a1, Character a2, Character b0, Character b1, Character b2, Character c0, Character c1, Character c2) {
            this.a0 = a0;
            this.a1 = a1;
            this.a2 = a2;
            this.b0 = b0;
            this.b1 = b1;
            this.b2 = b2;
            this.c0 = c0;
            this.c1 = c1;
            this.c2 = c2;
        }
    }

}
