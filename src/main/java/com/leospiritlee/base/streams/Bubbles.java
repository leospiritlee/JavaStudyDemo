package com.leospiritlee.base.streams;

import java.util.stream.Stream;

/**
 * @Project: JavaStudyDemo
 * @ClassName Bubbles
 * @description: TODO
 * @author: leospiritlee
 * @create: 2020-03-11 14:35
 **/
public class Bubbles {

    public static void main(String[] args) {
        Stream.generate(Bubble::bubbler)
                .limit(5)
                .forEach(System.out::println);
    }

}
