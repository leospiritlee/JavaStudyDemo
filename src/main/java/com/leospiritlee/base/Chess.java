package com.leospiritlee.base;

/**
 * @Project: JavaStudyDemo
 * @ClassName Chess
 * @description: TODO
 * @author: leospiritlee
 * @create: 2020-02-20 10:09
 **/

/* Output:
Game constructor
BoardGame constructor
Chess constructor
*/

public class Chess extends BoardGame {
    Chess() {
        super(11);
        System.out.println("Chess constructor");
    }
    public static void main(String[] args) {
        Chess x = new Chess();
    }
}


class Game {
    Game(int i) {
        System.out.println("Game constructor");
    }
}

class BoardGame extends Game {
    BoardGame(int i) {
        super(i);
        System.out.println("BoardGame constructor");
    }
}
