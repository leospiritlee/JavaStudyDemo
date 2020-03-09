package com.leospiritlee.base.functional;

import java.util.function.Function;

/**
 * @Project: JavaStudyDemo
 * @ClassName Function2Test
 * @description: TODO
 * @author: leospiritlee
 * @create: 2020-03-09 21:48
 **/
public class Function2Test {

    public static void main(String[] args) {
        Function<Integer, Integer> name = e -> e * 2;
        Function<Integer, Integer> square = e -> e * e;

        /**
         * 返回一个先执行当前函数对象apply方法再执行after函数对象apply方法的函数对象。
         *  先执行name对象的apply方法 输出 e = 2* 3 = 6
         *  再执行square对象的apply方法 输出 e = 6 * 6 =36
         */

        int value = name.andThen(square).apply(3);
        System.out.println("andThen value=" + value);

        /**
         * 返回一个先执行before函数对象apply方法再执行当前函数对象apply方法的函数对象
         * 先执行square对象的apply方法 e = 3 * 3 = 9
         * 再执行name对象的apply方法
         */
        int value2 = name.compose(square).apply(3);
        System.out.println("compose value2=" + value2);

        //返回一个执行了apply()方法之后只会返回输入参数的函数对象
        Object identity = Function.identity().apply("huohuo");
        System.out.println(identity);
    }

}
