package com.leospiritlee.base.streams;

import java.util.Arrays;
import java.util.Random;
import java.util.stream.IntStream;

/**
 * @Project: JavaStudyDemo
 * @ClassName RandInts
 * @description: TODO
 * @author: leospiritlee
 * @create: 2020-03-13 12:27
 **/
public class RandInts {

    private static int[] rints = new Random(47).
            ints(0, 1000).
            limit(100).
            toArray();
    public static IntStream rands() {
        return Arrays.stream(rints);
    }

}

