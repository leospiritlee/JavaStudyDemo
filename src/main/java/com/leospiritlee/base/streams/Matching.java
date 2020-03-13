package com.leospiritlee.base.streams;

import java.util.function.BiPredicate;
import java.util.function.Predicate;
import java.util.stream.IntStream;
import java.util.stream.Stream;


/**
 * @Project: JavaStudyDemo
 * @ClassName Matching
 * @description: TODO
 * @author: leospiritlee
 * @create: 2020-03-13 19:02
 **/
public class Matching {
    static void show(Matcher match, int val) {
        System.out.println(
                match.test(
                        //for (int i = startInclusive; i <= endInclusive ; i++) { ... }
                        IntStream.rangeClosed(1, 9)
                                .boxed()
                                .peek(n -> System.out.format("%d ", n)),
                        n -> n < val));
    }
    public static void main(String[] args) {
        show(Stream::allMatch, 10);
        show(Stream::allMatch, 4);
        show(Stream::anyMatch, 2);
        show(Stream::anyMatch, 0);
        show(Stream::noneMatch, 5);
        show(Stream::noneMatch, 0);
    }
}

interface Matcher extends BiPredicate<Stream<Integer>, Predicate<Integer>> {}