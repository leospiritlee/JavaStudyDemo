package com.leospiritlee.base.functional;

import java.util.function.IntSupplier;

/**
 * @Project: JavaStudyDemo
 * @ClassName Closure5
 * @description: TODO
 * @author: leospiritlee
 * @create: 2020-03-09 22:25
 **/
public class Closure5 {
    IntSupplier makeFun(int x) {
        /**
         * 等同 final 效果（Effectively Final）
         * i  x 的值没有变更
         */
        int i = 0;
//        i++;
//        x++;
        return () -> x + i;
    }

}
