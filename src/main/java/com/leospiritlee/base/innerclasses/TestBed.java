package com.leospiritlee.base.innerclasses;

/**
 * @Project: JavaStudyDemo
 * @ClassName TestBed
 * @description: TODO
 * @author: leospiritlee
 * @create: 2020-02-26 17:54
 **/
public class TestBed {

    public void f() { System.out.println("f()"); }

    public static class Tester {

        public static void main(String[] args) {
            TestBed t = new TestBed();
            t.f();
        }
    }

    public static void main(String[] args) {
        TestBed t = new TestBed();
        t.f();
    }

}
