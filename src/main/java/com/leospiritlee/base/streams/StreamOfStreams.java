package com.leospiritlee.base.streams;

import java.util.stream.Stream;

/**
 * @Project: JavaStudyDemo
 * @ClassName StreamOfStreams
 * @description: TODO
 * @author: leospiritlee
 * @create: 2020-03-12 13:53
 **/
public class StreamOfStreams {

    public static void main(String[] args) {
        Stream.of(1, 2, 3)
                .map(i -> Stream.of("Gonzo", "Kermit", "Beaker"))
                .map(e-> e.getClass().getName())
                .forEach(System.out::println);
    }

}
