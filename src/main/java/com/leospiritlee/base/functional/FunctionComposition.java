package com.leospiritlee.base.functional;

import java.util.function.Function;

/**
 * @Project: JavaStudyDemo
 * @ClassName FunctionComposition
 * @description: TODO
 * @author: leospiritlee
 * @create: 2020-03-09 22:33
 **/
public class FunctionComposition {

    static Function<String, String>
            f1 = s -> {
        System.out.println(s);
        return s.replace('A', '_');
    },
            f2 = s -> s.substring(3),
            f3 = s -> s.toLowerCase(),
            f4 = f1.compose(f2).andThen(f3);

    public static void main(String[] args) {
        /**
         *  先执行 f2 = s -> s.substring(3), s = AFTER ALL AMBULANCES
         *  在执行 f1 = s -> {
         *         System.out.println(s);
         *         return s.replace('A', '_')
         *         s = _FTER _LL _MBUL_NCES
         *  在执行  f3 = s -> s.toLowerCase(),
         *         s = _fter _ll _mbul_nces
         */
        System.out.println(
                f4.apply("GO AFTER ALL AMBULANCES")
        );
    }

}
