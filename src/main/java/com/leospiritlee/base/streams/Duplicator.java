package com.leospiritlee.base.streams;

import java.util.stream.Stream;

/**
 * @Project: JavaStudyDemo
 * @ClassName Duplicator
 * @description: TODO
 * @author: leospiritlee
 * @create: 2020-03-11 14:34
 **/
public class Duplicator {

    public static void main(String[] args) {
        Stream.generate(() -> "duplicate")
                .limit(3)
                .forEach(System.out::println);
    }

}
