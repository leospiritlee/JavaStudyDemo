package com.leospiritlee.base.streams;

import java.util.stream.Stream;

/**
 * @Project: JavaStudyDemo
 * @ClassName FunctionMap3
 * @description: TODO
 * @author: leospiritlee
 * @create: 2020-03-12 13:49
 **/
public class FunctionMap3 {

    public static void main(String[] args) {
        Stream.of("5", "7", "9")
                .mapToInt(Integer::parseInt)
                .forEach(n -> System.out.format("%d ", n));
        System.out.println();
        Stream.of("17", "19", "23")
                .mapToLong(Long::parseLong)
                .forEach(n -> System.out.format("%d ", n));
        System.out.println();
        Stream.of("17", "1.9", ".23")
                .mapToDouble(Double::parseDouble)
                .forEach(n -> System.out.format("%f ", n));
    }

}
