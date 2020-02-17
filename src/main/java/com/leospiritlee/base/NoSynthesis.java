package com.leospiritlee.base;

/**
 * @Project: JavaStudyDemo
 * @ClassName NoSynthesis
 * @description: TODO
 * @author: leospiritlee
 * @create: 2020-02-17 20:42
 **/
public class NoSynthesis {

    public static void main(String[] args) {
        //- Bird2 b = new Bird2(); // No default
        Bird2 b2 = new Bird2(1);
        Bird2 b3 = new Bird2(1.0);
    }
}

class Bird2 {
    Bird2(int i) {}
    Bird2(double d) {}
}
