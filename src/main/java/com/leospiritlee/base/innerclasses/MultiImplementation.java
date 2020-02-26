package com.leospiritlee.base.innerclasses;

/**
 * @Project: JavaStudyDemo
 * @ClassName MultiImplementation
 * @description: TODO
 * @author: leospiritlee
 * @create: 2020-02-26 18:27
 **/
public class MultiImplementation {

    static void takesD(D d) {}
    static void takesE(E e) {}

    public static void main(String[] args) {
        Z z = new Z();
        takesD(z);
        takesE(z.makeE());
    }

}

class D {}

abstract class E {}

class Z extends D {
    E makeE() {
        return new E() {};
    }
}
