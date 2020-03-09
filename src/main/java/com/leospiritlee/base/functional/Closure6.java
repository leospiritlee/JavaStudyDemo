package com.leospiritlee.base.functional;

import java.util.function.IntSupplier;

/**
 * @Project: JavaStudyDemo
 * @ClassName Closure6
 * @description: TODO
 * @author: leospiritlee
 * @create: 2020-03-09 22:26
 **/
public class Closure6 {

    IntSupplier makeFun(int x) {
        int i = 0;
        i++;
        x++;
        /**
         * 等同final  此处final 可以忽略
         */
        int iFinal = i;
        final int xFinal = x;
        return () -> xFinal + iFinal;
    }

}
