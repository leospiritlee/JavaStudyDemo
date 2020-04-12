package com.leospiritlee.base.concurrent;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @Project: JavaStudyDemo
 * @ClassName LambdasAndMethodReferences
 * @description: TODO
 * @author: leospiritlee
 * @create: 2020-04-12 12:56
 **/
public class LambdasAndMethodReferences {

    public static void main(String[] args)throws InterruptedException {
        ExecutorService exec = Executors.newCachedThreadPool();
        exec.submit(() -> System.out.println("Lambda1"));
        exec.submit(new NotRunnable()::go);

        exec.execute(() -> System.out.println("Lambda1"));
        exec.execute(new NotRunnable()::go);

        exec.submit(() -> {
            System.out.println("Lambda2");
            return 1;
        });
        exec.submit(new NotCallable()::get);

        exec.shutdown();
    }

}


class NotRunnable {
    public void go() {
        System.out.println("NotRunnable");
    }
}
class NotCallable {
    public Integer get() {
        System.out.println("NotCallable");
        return 1;
    }
}