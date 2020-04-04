package com.leospiritlee.base.arrays;

import java.util.Arrays;

/**
 * @Project: JavaStudyDemo
 * @ClassName ParameterizedArrayType
 * @description: TODO
 * @author: leospiritlee
 * @create: 2020-04-04 11:24
 **/
public class ParameterizedArrayType {

    public static void main(String[] args) {
        Integer[] ints = { 1, 2, 3, 4, 5 };
        Double[] doubles = { 1.1, 2.2, 3.3, 4.4, 5.5 };
        Integer[] ints2 = new ClassParameter<Integer>().f(ints);
        Double[] doubles2 = new ClassParameter<Double>().f(doubles);
        ints2 = MethodParameter.f(ints);
        System.out.println("ints2:" + Arrays.toString(ints2));
        doubles2 = MethodParameter.f(doubles);
        System.out.println("doubles2:" + Arrays.toString(doubles2));
    }

}


class ClassParameter<T> {
    public T[] f(T[] arg) { return arg; }
}

class MethodParameter {
    public static <T> T[] f(T[] arg) {
        return arg;
    }
}
