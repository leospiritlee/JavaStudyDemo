package com.leospiritlee.base.exceptions;

/**
 * @Project: JavaStudyDemo
 * @ClassName WhoCalled
 * @description: TODO
 * @author: leospiritlee
 * @create: 2020-03-14 19:37
 **/
public class WhoCalled {

    static void f() {
// Generate an exception to fill in the stack trace
        try {
            throw new Exception();
        } catch(Exception e) {
            for(StackTraceElement ste : e.getStackTrace()){
                System.out.println(ste.getMethodName());
                System.out.println(ste);
            }

        }
    }
    static void g() { f(); }
    static void h() { g(); }
    public static void main(String[] args) {
        f();
        System.out.println("*******");
        g();
        System.out.println("*******");
        h();
    }

}
