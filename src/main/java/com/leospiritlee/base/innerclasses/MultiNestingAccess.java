package com.leospiritlee.base.innerclasses;

/**
 * @Project: JavaStudyDemo
 * @ClassName MultiNestingAccess
 * @description: TODO
 * @author: leospiritlee
 * @create: 2020-02-26 18:02
 **/
public class MultiNestingAccess {

    public static void main(String[] args) {

        MNA mna = new MNA();
        MNA.A mnaa = mna.new A();
        MNA.A.B mnaab = mnaa.new B();
        mnaab.h();

    }

}


class MNA {

    private void f() {
        System.out.println("class MNA f()");
    }

    class A {
        private void g() {
            System.out.println("class A g()");
        }
        public class B {
            void h() {
                g();
                f();
            }
        }
    }
}