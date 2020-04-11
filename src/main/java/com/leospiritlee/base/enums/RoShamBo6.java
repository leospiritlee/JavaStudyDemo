package com.leospiritlee.base.enums;

import java.util.Arrays;

import static com.leospiritlee.base.enums.Outcome.*;

public enum RoShamBo6 implements Competitor<RoShamBo6> {
    PAPER, SCISSORS, ROCK;
    private static Outcome[][] table = {
            { DRAW, LOSE, WIN }, // PAPER
            { WIN, DRAW, LOSE }, // SCISSORS
            { LOSE, WIN, DRAW }, // ROCK
    };
    @Override
    public Outcome compete(RoShamBo6 other) {
        return table[this.ordinal()][other.ordinal()];
    }
    public static void main(String[] args) {
        System.out.println(Arrays.deepToString(table));


        RoShamBo.play(RoShamBo6.class, 20);
    }
}
