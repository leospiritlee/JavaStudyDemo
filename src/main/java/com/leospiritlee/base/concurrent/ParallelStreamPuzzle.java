package com.leospiritlee.base.concurrent;

import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @Project: JavaStudyDemo
 * @ClassName ParallelStreamPuzzle
 * @description: TODO
 * @author: leospiritlee
 * @create: 2020-04-12 11:37
 **/
public class ParallelStreamPuzzle {

    static class IntGenerator implements Supplier<Integer> {
        private int current = 0;
        public Integer get() {
            return current++;
        }
    }
    public static void main(String[] args) {
        List<Integer> x = Stream.generate(new IntGenerator())
                .limit(10)
                .parallel()  // [1]
                .collect(Collectors.toList());
        System.out.println(x);
    }


}
