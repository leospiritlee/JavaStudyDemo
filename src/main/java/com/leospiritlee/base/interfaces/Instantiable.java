package com.leospiritlee.base.interfaces;

/**
 * @Project: JavaStudyDemo
 * @ClassName Instantiable
 * @description: TODO
 * @author: leospiritlee
 * @create: 2020-02-24 14:20
 **/
public class Instantiable  extends Uninstantiable {

    @Override
    void f() {
        System.out.println("f()");
    }

    @Override
    int g() {
        return 22;
    }

    public static void main(String[] args) {
        Uninstantiable ui = new Instantiable();
        ui.f();
        ui.g();
    }
}

abstract class Uninstantiable {
    abstract void f();
    abstract int g();
}
