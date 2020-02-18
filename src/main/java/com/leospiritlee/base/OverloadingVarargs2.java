package com.leospiritlee.base;

/**
 * @Project: JavaStudyDemo
 * @ClassName OverloadingVarargs2
 * @description: TODO
 * @author: leospiritlee
 * @create: 2020-02-18 21:39
 **/
public class OverloadingVarargs2 {

    static void f(float i, Character... args) {
        System.out.println("first");
    }

    static void f(Character... args) {
        System.out.println("second");
    }

    public static void main(String[] args) {
        f(1, 'a');
        //与以上f 都匹配
//        f('a', 'b');
    }
}
