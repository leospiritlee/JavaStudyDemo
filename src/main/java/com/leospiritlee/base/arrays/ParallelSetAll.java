package com.leospiritlee.base.arrays;

import com.leospiritlee.base.onjava.Rand;

import java.util.Arrays;

/**
 * @Project: JavaStudyDemo
 * @ClassName ParallelSetAll
 * @description: TODO
 * @author: leospiritlee
 * @create: 2020-04-04 19:12
 **/
public class ParallelSetAll {

    static final int SIZE = 10_000_000;

    static void intArray() {
        int[] ia = new int[SIZE];
        long currentTime = System.currentTimeMillis();
        Arrays.setAll(ia, new Rand.Pint()::get);
        long endTime = System.currentTimeMillis();
        System.out.println("spend time : " + (endTime - currentTime) + " , ia.length: " + ia.length);

        currentTime = System.currentTimeMillis();
        Arrays.parallelSetAll(ia, new Rand.Pint()::get);
        endTime = System.currentTimeMillis();
        System.out.println("spend time : " + (endTime - currentTime) + " , ia.length: " + ia.length);
    }

    static void longArray() {
        long[] la = new long[SIZE];
        long currentTime = System.currentTimeMillis();
        Arrays.setAll(la, new Rand.Plong()::get);
        long endTime = System.currentTimeMillis();
        System.out.println("spend time : " + (endTime - currentTime) + " , la.length: " + la.length);

        currentTime = System.currentTimeMillis();
        Arrays.parallelSetAll(la, new Rand.Plong()::get);
        endTime = System.currentTimeMillis();
        System.out.println("spend time : " + (endTime - currentTime) + " , la.length: " + la.length);
    }

    public static void main(String[] args) {
        intArray();
        longArray();
    }

}
