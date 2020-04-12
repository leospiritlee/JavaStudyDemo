package com.leospiritlee.base.concurrent;

import com.leospiritlee.base.onjava.Nap;

import java.util.concurrent.atomic.AtomicBoolean;

/**
 * @Project: JavaStudyDemo
 * @ClassName QuittableTask
 * @description: TODO
 * @author: leospiritlee
 * @create: 2020-04-12 13:06
 **/
public class QuittableTask implements Runnable {
    final int id;
    public QuittableTask(int id) {
        this.id = id;
    }
    private AtomicBoolean running = new AtomicBoolean(true);
    public void quit() {
        running.set(false);
    }
    @Override
    public void run() {
        //只要运行标志为true，此任务的run()方法将继续。
        while(running.get())   {
            new Nap(0.1);
        }

        //显示仅在任务退出时发生
        System.out.print(id + " ");
    }
}
