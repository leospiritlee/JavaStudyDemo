package com.leospiritlee.base.exceptions;

/**
 * @Project: JavaStudyDemo
 * @ClassName NeverCaught
 * @description: TODO
 * @author: leospiritlee
 * @create: 2020-03-15 11:53
 **/
public class NeverCaught {

    static void f() {
        throw new RuntimeException("From f()");
    }
    static void g() {
        f();
    }
    public static void main(String[] args) {
        g();
    }

}
