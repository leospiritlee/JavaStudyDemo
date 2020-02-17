package com.leospiritlee.base;

/**
 * @Project: JavaStudyDemo
 * @ClassName TimedAbort
 * @description: TODO
 * @author: leospiritlee
 * @create: 2020-02-16 15:37
 **/
public class TimedAbort {

    private int sleepTime;

    public TimedAbort(int sleepTime) {
        this.sleepTime = sleepTime;

        try {
            Thread.sleep(3 * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
