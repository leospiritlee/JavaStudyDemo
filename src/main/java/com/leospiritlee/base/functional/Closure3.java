package com.leospiritlee.base.functional;

import java.util.function.IntSupplier;

/**
 * @Project: JavaStudyDemo
 * @ClassName Closure3
 * @description: TODO
 * @author: leospiritlee
 * @create: 2020-03-09 22:23
 **/
public class Closure3 {

    IntSupplier makeFun(int x) {
        int i = 0;
        // x++ 和 i++ 都会报错：
        return () -> x + i;
    }

}
