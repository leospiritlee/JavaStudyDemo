package com.leospiritlee.base.concurrent;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.stream.IntStream;

/**
 * @Project: JavaStudyDemo
 * @ClassName SingleThreadExecutor2
 * @description: TODO
 * @author: leospiritlee
 * @create: 2020-04-12 11:52
 **/
public class SingleThreadExecutor2 {

    public static void main(String[] args)throws InterruptedException {
        ExecutorService exec = Executors.newSingleThreadExecutor();
        IntStream.range(0, 10)
                .mapToObj(NapTask::new)
                .forEach(exec::execute);
        exec.shutdown();
    }

}
