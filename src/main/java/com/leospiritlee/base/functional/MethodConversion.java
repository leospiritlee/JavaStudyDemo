package com.leospiritlee.base.functional;

import java.util.function.BiConsumer;

/**
 * @Project: JavaStudyDemo
 * @ClassName MethodConversion
 * @description: TODO
 * @author: leospiritlee
 * @create: 2020-03-08 13:55
 **/
public class MethodConversion {

    static void accept(In1 i1, In2 i2) {
        System.out.println("accept()");
    }
    static void someOtherName(In1 i1, In2 i2) {
        System.out.println("someOtherName()");
    }
    public static void main(String[] args) {
        BiConsumer<In1,In2> bic;

        bic = MethodConversion::accept;
        bic.accept(new In1(), new In2());

        bic = MethodConversion::someOtherName;
        // bic.someOtherName(new In1(), new In2()); // Nope
        bic.accept(new In1(), new In2());
    }

}

class In1 {}
class In2 {}