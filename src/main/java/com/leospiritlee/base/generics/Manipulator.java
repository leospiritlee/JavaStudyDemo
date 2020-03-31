package com.leospiritlee.base.generics;

/**
 * @Project: JavaStudyDemo
 * @ClassName Manipulator
 * @description: TODO
 * @author: leospiritlee
 * @create: 2020-03-31 10:37
 **/
public class Manipulator<T> {

    private T obj;

    Manipulator(T x) {
        obj = x;
    }

    // Error: cannot find symbol: method f():
    public void manipulate() {
//        obj.f();
    }

}
