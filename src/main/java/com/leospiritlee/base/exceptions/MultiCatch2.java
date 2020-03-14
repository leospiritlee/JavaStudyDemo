package com.leospiritlee.base.exceptions;

/**
 * @Project: JavaStudyDemo
 * @ClassName MultiCatch2
 * @description: TODO
 * @author: leospiritlee
 * @create: 2020-03-14 19:32
 **/
public class MultiCatch2 {

    void x() throws Except1, Except2, Except3, Except4 {}
    void process1() {}
    void process2() {}
    void f() {
        try {
            x();
        } catch(Except1 | Except2 e) {
            process1();
        } catch(Except3 | Except4 e) {
            process2();
        }
    }

}
