package com.leospiritlee.base.streams;

import java.util.stream.Stream;

/**
 * @Project: JavaStudyDemo
 * @ClassName FlatMap
 * @description: TODO
 * @author: leospiritlee
 * @create: 2020-03-12 13:53
 **/
public class FlatMap {

    public static void main(String[] args) {
        Stream.of(1, 2, 3)
                .flatMap(i -> Stream.of("Gonzo", "Fozzie", "Beaker"))
                .forEach(System.out::println);
    }

}
