package com.leospiritlee.base;

import java.util.Arrays;

/**
 * @Project: JavaStudyDemo
 * @ClassName ArrayInit
 * @description: TODO
 * @author: leospiritlee
 * @create: 2020-02-18 21:24
 **/
public class ArrayInit {

    public static void main(String[] args) {
        Integer[] a = {
                1, 2,
                3, // Autoboxing
        };
        Integer[] b = new Integer[] {
                1, 2,
                3, // Autoboxing
        };
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));

    }
}
