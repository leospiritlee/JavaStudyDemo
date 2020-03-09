package com.leospiritlee.base.functional;

import java.util.function.IntSupplier;

/**
 * @Project: JavaStudyDemo
 * @ClassName Closure4
 * @description: TODO
 * @author: leospiritlee
 * @create: 2020-03-09 22:24
 **/
public class Closure4 {

    IntSupplier makeFun(final int x) {
        final int i = 0;
        return () -> x + i;
    }

}
