package com.leospiritlee.base.streams;

import static java.util.stream.LongStream.range;

/**
 * @Project: JavaStudyDemo
 * @ClassName Repeat
 * @description: TODO
 * @author: leospiritlee
 * @create: 2020-03-11 14:25
 **/
public class Repeat {

    /**
     * for (long i = startInclusive; i < endExclusive ; i++)
     * @param n
     * @param action
     */
    public static void repeat(int n, Runnable action) {
        range(0, n).forEach(i -> action.run());
    }

}
