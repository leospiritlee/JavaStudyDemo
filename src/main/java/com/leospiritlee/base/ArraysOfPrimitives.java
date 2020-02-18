package com.leospiritlee.base;

/**
 * @Project: JavaStudyDemo
 * @ClassName ArraysOfPrimitives
 * @description: TODO
 * @author: leospiritlee
 * @create: 2020-02-18 21:21
 **/
public class ArraysOfPrimitives {

    public static void main(String[] args) {
        int[] a1 = {1, 2, 3, 4, 5};
        int[] a2;
        a2 = a1; //同一个数组的别名  a1 a2
        for (int i = 0; i < a2.length; i++) {
            a2[i] += 1;
        }
        for (int i = 0; i < a1.length; i++) {
            System.out.println("a1[" + i + "] = " + a1[i]);
        }
    }

}
