package com.leospiritlee.base.concurrent;

import java.util.concurrent.Callable;

/**
 * @Project: JavaStudyDemo
 * @ClassName CountingTask
 * @description: TODO
 * @author: leospiritlee
 * @create: 2020-04-12 12:41
 **/
public class CountingTask  implements Callable<Integer> {
    final int id;
    public CountingTask(int id) { this.id = id; }
    @Override
    public Integer call() {
        Integer val = 0;
        for(int i = 0; i < 100; i++){
            val++;
        }

        System.out.println(id + " " +  Thread.currentThread().getName() + " " + val);
        return val;
    }
}
