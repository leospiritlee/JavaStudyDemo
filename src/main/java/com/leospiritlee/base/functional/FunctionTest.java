package com.leospiritlee.base.functional;

import java.util.function.Function;

/**
 * @Project: JavaStudyDemo
 * @ClassName FunctionTest
 * @description: TODO
 * @author: leospiritlee
 * @create: 2020-03-09 21:40
 **/
public class FunctionTest<In, Out> {

    private Function<In, Out> processor = new Function<In, Out>() {
        @Override
        public Out apply(In in) {
            return (Out) new String("apply:" + in);

        }
    };

    private Function<In, Out> processor2 = in -> {
         return (Out) new String("applyL2:" + in);
    };




    public static void main(String[] args) {
        FunctionTest<String, String> functionTest = new FunctionTest();
        System.out.println(functionTest.processor.apply("hello~!"));
        System.out.println(functionTest.processor2.apply("hello~!"));
    }


}
