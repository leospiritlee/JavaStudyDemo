package com.leospiritlee.base;

/**
 * @Project: JavaStudyDemo
 * @ClassName OverloadingVarargs3
 * @description: TODO
 * @author: leospiritlee
 * @create: 2020-02-18 21:41
 **/
public class OverloadingVarargs3 {

    static void f(float i, Character... args) {
        System.out.println("first");
    }

    static void f(char c, Character... args) {
        System.out.println("second");
    }

    public static void main(String[] args) {
        f(1, 'a');
        f('a', 'b');
    }
}
