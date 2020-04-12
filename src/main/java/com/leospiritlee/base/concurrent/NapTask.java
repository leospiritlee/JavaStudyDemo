package com.leospiritlee.base.concurrent;


import com.leospiritlee.base.onjava.Nap;

/**
 * @Project: JavaStudyDemo
 * @ClassName NapTask
 * @description: TODO
 * @author: leospiritlee
 * @create: 2020-04-12 11:46
 **/
public class NapTask implements Runnable {
    final int id;
    public NapTask(int id) {
        this.id = id;
    }

    @Override
    public void run() {
        new Nap(0.1);// Seconds
        System.out.println(this + " "+ Thread.currentThread().getName());
    }

    @Override
    public String toString() {
        return"NapTask[" + id + "]";
    }
}
