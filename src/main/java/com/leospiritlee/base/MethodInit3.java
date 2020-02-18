package com.leospiritlee.base;

/**
 * @Project: JavaStudyDemo
 * @ClassName MethodInit3
 * @description: TODO
 * @author: leospiritlee
 * @create: 2020-02-18 16:48
 **/
public class MethodInit3 {

    //- int j = g(i); // Illegal forward reference
    int i = f();

    int f() {
        return 11;
    }

    int g(int n) {
        return n * 10;
    }
}
