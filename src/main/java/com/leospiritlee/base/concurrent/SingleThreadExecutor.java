package com.leospiritlee.base.concurrent;

import com.leospiritlee.base.onjava.Nap;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.stream.IntStream;

/**
 * @Project: JavaStudyDemo
 * @ClassName SingleThreadExecutor
 * @description: TODO
 * @author: leospiritlee
 * @create: 2020-04-12 11:50
 **/
public class SingleThreadExecutor {

    public static void main(String[] args) {
        ExecutorService exec = Executors.newSingleThreadExecutor();
        IntStream.range(0, 10)
                .mapToObj(NapTask::new)
                .forEach(exec::execute);
        System.out.println("All tasks submitted");
        exec.shutdown();
        while(!exec.isTerminated()) {
            System.out.println(Thread.currentThread().getName()+" awaiting termination");
            new Nap(0.1);
        }
    }

}
