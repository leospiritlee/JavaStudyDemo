package com.leospiritlee.base.concurrent;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.stream.IntStream;

/**
 * @Project: JavaStudyDemo
 * @ClassName SingleThreadExecutor3
 * @description: TODO
 * @author: leospiritlee
 * @create: 2020-04-12 12:39
 **/
public class SingleThreadExecutor3 {

    public static void main(String[] args)throws InterruptedException {
        ExecutorService exec = Executors.newSingleThreadExecutor();
        IntStream.range(0, 10)
                .mapToObj(InterferingTask::new)
                .forEach(exec::execute);
        exec.shutdown();
    }

}
