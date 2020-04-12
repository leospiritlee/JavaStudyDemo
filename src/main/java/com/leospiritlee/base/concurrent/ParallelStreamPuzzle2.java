package com.leospiritlee.base.concurrent;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Deque;
import java.util.List;
import java.util.concurrent.ConcurrentLinkedDeque;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @Project: JavaStudyDemo
 * @ClassName ParallelStreamPuzzle2
 * @description: TODO
 * @author: leospiritlee
 * @create: 2020-04-12 11:38
 **/
public class ParallelStreamPuzzle2 {


    public static final Deque<String> trace = new ConcurrentLinkedDeque<>();
    static class IntGenerator implements Supplier<Integer> {
        private AtomicInteger current = new AtomicInteger();

        @Override
        public Integer get() {
            trace.add(current.get() + ": " +Thread.currentThread().getName());
            return current.getAndIncrement();
        }
    }
    public static void main(String[] args) throws Exception {
        List<Integer> x = Stream.generate(new IntGenerator())
                .limit(10)
                .parallel()
                .collect(Collectors.toList());
        System.out.println(x);
        Files.write(Paths.get("PSP2.txt"), trace);
    }

}
