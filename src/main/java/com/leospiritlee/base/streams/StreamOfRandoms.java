package com.leospiritlee.base.streams;

import java.util.Random;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * @Project: JavaStudyDemo
 * @ClassName StreamOfRandoms
 * @description: TODO
 * @author: leospiritlee
 * @create: 2020-03-12 13:55
 **/
public class StreamOfRandoms {

    static Random rand = new Random(47);
    public static void main(String[] args) {
        Stream.of(1, 2, 3, 4, 5)
                .flatMapToInt(i -> IntStream.concat(
                        rand.ints(0, 100).limit(i), IntStream.of(-1)))
                .forEach(n -> System.out.format("%d ", n));
    }

}
