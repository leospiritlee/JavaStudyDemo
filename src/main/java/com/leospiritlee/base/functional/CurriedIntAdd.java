package com.leospiritlee.base.functional;

import java.util.function.IntFunction;
import java.util.function.IntUnaryOperator;

/**
 * @Project: JavaStudyDemo
 * @ClassName CurriedIntAdd
 * @description: TODO
 * @author: leospiritlee
 * @create: 2020-03-10 09:51
 **/
public class CurriedIntAdd {

    public static void main(String[] args) {

        /**
         *  两个int 参数 求和
         */
        IntFunction<IntUnaryOperator> curriedIntAdd = a -> b -> a + b;
        IntUnaryOperator add4 = curriedIntAdd.apply(4);
        System.out.println(add4.applyAsInt(5));

    }

}
