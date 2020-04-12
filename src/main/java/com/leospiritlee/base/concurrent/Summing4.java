package com.leospiritlee.base.concurrent;

import java.util.Arrays;

/**
 * @Project: JavaStudyDemo
 * @ClassName Summing4
 * @description: TODO
 * @author: leospiritlee
 * @create: 2020-04-12 11:35
 **/
public class Summing4 {

    public static void main(String[] args) {
        System.out.println(Summing3.CHECK);
        Long[] aL = new Long[Summing3.SZ+1];
        Arrays.parallelSetAll(aL, i -> (long)i);
        Summing.timeTest("Long Parallel",
                Summing3.CHECK, () ->
                        Arrays.stream(aL)
                                .parallel()
                                .reduce(0L,Long::sum));
    }

}
