package com.leospiritlee.base;

import java.util.Arrays;
import java.util.Random;

/**
 * @Project: JavaStudyDemo
 * @ClassName ArrayNew
 * @description: TODO
 * @author: leospiritlee
 * @create: 2020-02-18 21:22
 **/
public class ArrayNew {

    public static void main(String[] args) {
        int[] a;
        Random rand = new Random(47);
        a = new int[rand.nextInt(20)];
        System.out.println("length of a = " + a.length);
        System.out.println(Arrays.toString(a));
    }
}
