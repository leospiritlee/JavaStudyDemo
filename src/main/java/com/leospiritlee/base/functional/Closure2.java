package com.leospiritlee.base.functional;

import java.util.function.IntSupplier;

/**
 * @Project: JavaStudyDemo
 * @ClassName Closure2
 * @description: TODO
 * @author: leospiritlee
 * @create: 2020-03-09 22:23
 **/
public class Closure2 {

    IntSupplier makeFun(int x) {
        int i = 0;
        return () -> x + i;
    }


}
