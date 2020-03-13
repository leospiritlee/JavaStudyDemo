package com.leospiritlee.base.streams;

import static com.leospiritlee.base.streams.RandInts.rands;

/**
 * @Project: JavaStudyDemo
 * @ClassName ForEach
 * @description: TODO
 * @author: leospiritlee
 * @create: 2020-03-13 12:28
 **/
public class ForEach {

    static final int SZ = 14;
    public static void main(String[] args) {
        rands().limit(SZ)
                .forEach(n -> System.out.format("%d ", n));
        System.out.println();
        rands().limit(SZ)
                .parallel()
                .forEach(n -> System.out.format("%d ", n));
        System.out.println();
        rands().limit(SZ)
                .parallel()
                .forEachOrdered(n -> System.out.format("%d ", n));
    }

}
