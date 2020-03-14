package com.leospiritlee.base.exceptions;

/**
 * @Project: JavaStudyDemo
 * @ClassName MultiCatch
 * @description: TODO
 * @author: leospiritlee
 * @create: 2020-03-14 19:30
 **/
public class MultiCatch {

    void x() throws Except1, Except2, Except3, Except4 {}
    void process() {}
    void f() {
        try {
            x();
        } catch(Except1 | Except2 | Except3 | Except4 e) {
            process();
        }
    }

}
