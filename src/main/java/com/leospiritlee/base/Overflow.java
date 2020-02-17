package com.leospiritlee.base;

/**
 * @Project: JavaStudyDemo
 * @ClassName Overflow
 * @description: TODO
 * @author: leospiritlee
 * @create: 2020-02-16 13:45
 **/
public class Overflow {

    public static void main(String[] args) {
        int big = Integer.MAX_VALUE;
        System.out.println("big = " + big);
        int bigger = big * 4;
        System.out.println("bigger = " + bigger);
    }
}
