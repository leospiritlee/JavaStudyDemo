package com.leospiritlee.base.concurrent;

import java.util.stream.IntStream;

/**
 * @Project: JavaStudyDemo
 * @ClassName CountingStream
 * @description: TODO
 * @author: leospiritlee
 * @create: 2020-04-12 12:51
 **/
public class CountingStream {

    public static void main(String[] args) {
        System.out.println(
                IntStream.range(0, 10)
                        .parallel()
                        .mapToObj(CountingTask::new)
                        .map(ct -> ct.call())
                        .reduce(0, Integer::sum)
        );
    }

}
