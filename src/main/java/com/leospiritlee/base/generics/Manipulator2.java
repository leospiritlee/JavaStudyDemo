package com.leospiritlee.base.generics;

/**
 * @Project: JavaStudyDemo
 * @ClassName Manipulator2
 * @description: TODO
 * @author: leospiritlee
 * @create: 2020-03-31 10:39
 **/
public class Manipulator2<T extends HasF> {

    private T obj;

    Manipulator2(T x) {
        obj = x;
    }

    public void manipulate() {
        obj.f();
        obj.g();
    }

}
