package com.leospiritlee.base;

/**
 * @Project: JavaStudyDemo
 * @ClassName MethodInit2
 * @description: TODO
 * @author: leospiritlee
 * @create: 2020-02-18 16:48
 **/
public class MethodInit2 {

    int i = f();
    int j = g(i);

    int f() {
        return 11;
    }

    int g(int n) {
        return n * 10;
    }
}
