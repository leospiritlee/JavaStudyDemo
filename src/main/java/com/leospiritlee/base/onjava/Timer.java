package com.leospiritlee.base.onjava;

import static java.util.concurrent.TimeUnit.NANOSECONDS;

/**
 * @Project: JavaStudyDemo
 * @ClassName Timer
 * @description: TODO
 * @author: leospiritlee
 * @create: 2020-04-11 20:54
 **/
public class Timer {

    private long start = System.nanoTime();
    public long duration() {
        return NANOSECONDS.toMillis(System.nanoTime() - start);
    }
    public static long duration(Runnable test) {
        Timer timer = new Timer();
        test.run();
        return timer.duration();
    }

}
