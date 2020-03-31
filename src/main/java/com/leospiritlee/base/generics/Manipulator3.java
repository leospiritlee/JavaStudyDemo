package com.leospiritlee.base.generics;

/**
 * @Project: JavaStudyDemo
 * @ClassName Manipulator3
 * @description: TODO
 * @author: leospiritlee
 * @create: 2020-03-31 10:41
 **/
public class Manipulator3 {

    private HasF obj;

    Manipulator3(HasF x) {
        obj = x;
    }

    public void manipulate() {
        obj.f();
    }

}
