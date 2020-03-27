package com.leospiritlee.base.typeinfo;

/**
 * @Project: JavaStudyDemo
 * @ClassName InterfaceViolation
 * @description: TODO
 * @author: leospiritlee
 * @create: 2020-03-27 17:04
 **/
public class InterfaceViolation {

    public static void main(String[] args) {
        A a = new B();
        a.f();
        // a.g(); // Compile error
        System.out.println(a.getClass().getName());
        if (a instanceof B) {
            B b = (B) a;
            b.g();
        }
    }

}
