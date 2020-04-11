package com.leospiritlee.base.annotations;

/**
 * @Project: JavaStudyDemo
 * @ClassName SimpleTest
 * @description: TODO
 * @author: leospiritlee
 * @create: 2020-04-11 19:16
 **/
@Simple
public class SimpleTest {

    @Simple
    int i;
    @Simple
    public SimpleTest() {}
    @Simple
    public void foo() {
        System.out.println("SimpleTest.foo()");
    }
    @Simple
    public void bar(String s, int i, float f) {
        System.out.println("SimpleTest.bar()");
    }
    @Simple
    public static void main(String[] args) {
        @Simple
        SimpleTest st = new SimpleTest();
        st.foo();
    }

}
