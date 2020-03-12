package com.leospiritlee.base.streams;

import java.util.stream.Stream;

/**
 * @Project: JavaStudyDemo
 * @ClassName FunctionMap2
 * @description: TODO
 * @author: leospiritlee
 * @create: 2020-03-12 13:49
 **/
public class FunctionMap2 {

    public static void main(String[] args) {
        Stream.of(1, 5, 7, 9, 11, 13)
                .map(Numbered::new)
                .forEach(System.out::println);
    }
}
