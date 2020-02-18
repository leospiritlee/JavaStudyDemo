package com.leospiritlee.base;

/**
 * @Project: JavaStudyDemo
 * @ClassName AutoboxingVarargs
 * @description: TODO
 * @author: leospiritlee
 * @create: 2020-02-18 21:36
 **/
public class AutoboxingVarargs {

    public static void f(Integer... args) {
        System.out.println(args.getClass());
        for (Integer i: args) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        f(1, 2);
        f(4, 5, 6, 7, 8, 9);
        f(10, 11, 12);

    }
}
