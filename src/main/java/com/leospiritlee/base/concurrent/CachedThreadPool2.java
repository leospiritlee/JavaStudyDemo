package com.leospiritlee.base.concurrent;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.stream.IntStream;

/**
 * @Project: JavaStudyDemo
 * @ClassName CachedThreadPool2
 * @description: TODO
 * @author: leospiritlee
 * @create: 2020-04-12 12:38
 **/
public class CachedThreadPool2 {

    public static void main(String[] args) {
        ExecutorService exec = Executors.newCachedThreadPool();
        IntStream.range(0, 10)
                .mapToObj(InterferingTask::new)
                .forEach(exec::execute);
        exec.shutdown();
    }
}
