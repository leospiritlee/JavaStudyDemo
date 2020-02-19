package com.leospiritlee.base;

/**
 * @Project: JavaStudyDemo
 * @ClassName Cartoon
 * @description: TODO
 * @author: leospiritlee
 * @create: 2020-02-19 17:24
 **/

/* Output:
Art constructor
Drawing constructor
Cartoon constructor
*/

public class Cartoon extends Drawing {

    public Cartoon() {
        System.out.println("Cartoon constructor");
    }
    public static void main(String[] args) {
        Cartoon x = new Cartoon();
    }
}


class Art {
    Art() {
        System.out.println("Art constructor");
    }
}

class Drawing extends Art {
    Drawing() {
        System.out.println("Drawing constructor");
    }
}