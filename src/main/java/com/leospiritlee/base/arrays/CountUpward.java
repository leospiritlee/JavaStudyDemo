package com.leospiritlee.base.arrays;

import java.util.stream.LongStream;

import static com.leospiritlee.base.onjava.ArrayShow.show;

/**
 * @Project: JavaStudyDemo
 * @ClassName CountUpward
 * @description: TODO
 * @author: leospiritlee
 * @create: 2020-04-04 18:57
 **/
public class CountUpward {


    static long[] fillCounted(int size) {
        return LongStream.iterate(0, i -> i + 1).limit(size).toArray();
    }

    public static void main(String[] args) {
        long[] l1 = fillCounted(20); // No problem
        show(l1);
        // On my machine, this runs out of heap space:
        // - long[] l2 = fillCounted(10_000_000);
    }
}
