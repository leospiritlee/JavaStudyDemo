package com.leospiritlee.base.streams;

import static com.leospiritlee.base.streams.Repeat.repeat;

/**
 * @Project: JavaStudyDemo
 * @ClassName Looping
 * @description: TODO
 * @author: leospiritlee
 * @create: 2020-03-11 14:26
 **/
public class Looping {

    static void hi() {
        System.out.println("Hi!");
    }
    public static void main(String[] args) {
        repeat(3, () -> System.out.println("Looping!"));
        repeat(2, Looping::hi);
    }

}
