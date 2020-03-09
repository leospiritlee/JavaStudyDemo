package com.leospiritlee.base.functional;

import java.util.function.IntSupplier;

/**
 * @Project: JavaStudyDemo
 * @ClassName Closure7
 * @description: TODO
 * @author: leospiritlee
 * @create: 2020-03-09 22:26
 **/
public class Closure7 {

    IntSupplier makeFun(int x) {
        Integer i = 0;
        i = i + 1;
        Integer finalI = i;
        return () -> x + finalI;
    }

}
