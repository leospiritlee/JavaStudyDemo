package com.leospiritlee.base.functional;

import java.util.function.Function;

/**
 * @Project: JavaStudyDemo
 * @ClassName CurryingAndPartials
 * @description: TODO
 * @author: leospiritlee
 * @create: 2020-03-10 09:47
 **/
public class CurryingAndPartials {

    // 未柯里化:
    static String uncurried(String a, String b) {
        return a + b;
    }
    public static void main(String[] args) {

        System.out.println(uncurried("Hi ", "Ho"));

        // 柯里化的函数:
        /**
         * 这一连串的箭头很巧妙。注意，在函数接口声明中，第二个参数是另一个函数。
         */
        Function<String, Function<String, String>> sum =
                a -> b -> a + b; // [1]
        /**
         *  柯里化的目的是能够通过提供一个参数来创建一个新函数，所以现在有了一个“带参函数”和剩下的 “无参函数” 。
         */
        Function<String, String>  hi = sum.apply("Hi "); // [2]
        System.out.println(hi.apply("Ho"));

        // 部分应用:
        Function<String, String> sumHi =
                sum.apply("Hup ");
        System.out.println(sumHi.apply("Ho"));
        System.out.println(sumHi.apply("Hey"));


        Function<String, Function<String, String>> count = a -> b -> a + b;

        /**
         *  初始化 T参数
         */
        Function<String, String> hi_2 = count.apply("test ");
        /**
         *  执行 a -> b -> a + b;
         */
        System.out.println(hi_2.apply("hey"));
    }


}
