package com.leospiritlee.base.streams;

import java.util.Optional;

/**
 * @Project: JavaStudyDemo
 * @ClassName StreamOfOptionals
 * @description: TODO
 * @author: leospiritlee
 * @create: 2020-03-12 22:20
 **/
public class StreamOfOptionals {

    public static void main(String[] args) {
        Signal.stream()
                .limit(10)
                .forEach(System.out::println);
        System.out.println(" ---");
        Signal.stream()
                .limit(10)
                .filter(Optional::isPresent)
                .map(Optional::get)
                .forEach(System.out::println);
    }
}
