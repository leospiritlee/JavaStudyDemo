package com.leospiritlee.base.collections;

import java.util.Arrays;

/**
 * @Project: JavaStudyDemo
 * @ClassName ArrayIsNotIterable
 * @description: TODO
 * @author: leospiritlee
 * @create: 2020-03-02 14:37
 **/
public class ArrayIsNotIterable {

    static <T> void test(Iterable<T> ib) {
        for(T t : ib)
            System.out.print(t + " ");
    }
    public static void main(String[] args) {
        test(Arrays.asList(1, 2, 3));
        String[] strings = { "A", "B", "C" };
        // An array works in for-in, but it's not Iterable:
        //- test(strings);
        // You must explicitly convert it to an Iterable:
        test(Arrays.asList(strings));
    }

}
