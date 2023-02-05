package com.imc.RockScissorsPaperGame.Move;

public enum Move {
    ROCK(1),
    SCISSORS(2),
    PAPER(3);

    private int numValue;

    Move(int numValue) {
        this.numValue = numValue;
    }

    public int getNumValue() {
        return numValue;
    }
}
