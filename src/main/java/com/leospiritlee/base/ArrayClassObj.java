package com.leospiritlee.base;

import java.util.Arrays;
import java.util.Random;

/**
 * @Project: JavaStudyDemo
 * @ClassName ArrayClassObj
 * @description: TODO
 * @author: leospiritlee
 * @create: 2020-02-18 21:24
 **/
public class ArrayClassObj {

    public static void main(String[] args) {
        Random rand = new Random(47);
        Integer[] a = new Integer[rand.nextInt(20)];
        System.out.println("length of a = " + a.length);
        for (int i = 0; i < a.length; i++) {
            a[i] = rand.nextInt(500); // Autoboxing
        }
        System.out.println(Arrays.toString(a));
    }
}
