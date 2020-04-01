package com.leospiritlee.base.generics;

import com.leospiritlee.base.onjava.Rand;

import java.util.Arrays;

/**
 * @Project: JavaStudyDemo
 * @ClassName PrimitiveGenericTest
 * @description: TODO
 * @author: leospiritlee
 * @create: 2020-04-01 21:36
 **/
public class PrimitiveGenericTest {

    public static void main(String[] args) {
        String[] strings = FillArray.fill(new String[5], new Rand.String(9));
        System.out.println(Arrays.toString(strings));
        int[] integers = FillArray.fill(new int[9], new Rand.Pint());
        System.out.println(Arrays.toString(integers));
    }

}
