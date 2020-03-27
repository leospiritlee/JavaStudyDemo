package com.leospiritlee.base.typeinfo;

/**
 * @Project: JavaStudyDemo
 * @ClassName B
 * @description: TODO
 * @author: leospiritlee
 * @create: 2020-03-27 17:04
 **/
public class B implements A {
    @Override
    public void f() {
        System.out.println(this.getClass().getSimpleName() + ".f()");
    }

    public void g() {
        System.out.println(this.getClass().getSimpleName() + ".g()");
    }
}
