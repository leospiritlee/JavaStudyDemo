package com.leospiritlee.base.concurrent;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.RejectedExecutionException;

/**
 * @Project: JavaStudyDemo
 * @ClassName MoreTasksAfterShutdown
 * @description: TODO
 * @author: leospiritlee
 * @create: 2020-04-12 12:06
 **/
public class MoreTasksAfterShutdown {

    public static void main(String[] args) {
        ExecutorService exec = Executors.newSingleThreadExecutor();
        exec.execute(new NapTask(1));
        exec.shutdown();
        try {
            exec.execute(new NapTask(99));
        } catch(RejectedExecutionException e) {
            System.out.println(e);
        }
    }

}
