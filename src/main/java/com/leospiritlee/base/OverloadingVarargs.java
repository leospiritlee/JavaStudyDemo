package com.leospiritlee.base;

/**
 * @Project: JavaStudyDemo
 * @ClassName OverloadingVarargs
 * @description: TODO
 * @author: leospiritlee
 * @create: 2020-02-18 21:37
 **/
public class OverloadingVarargs {

    static void f(Character... args) {
        System.out.print("first");
        for (Character c: args) {
            System.out.print(" " + c);
        }
        System.out.println();
    }

    static void f(Integer... args) {
        System.out.print("second");
        for (Integer i: args) {
            System.out.print(" " + i);
        }
        System.out.println();
    }

    static void f(Long... args) {
        System.out.print("third");
        for(Long l: args){
            System.out.print(" " + l);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        f('a', 'b', 'c');
        f(1);
        f(2, 1);
        f(0);
        f(0L);
        //- f(); // Won's compile -- ambiguous
    }
}
