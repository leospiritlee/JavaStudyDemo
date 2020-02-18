package com.leospiritlee.base;

/**
 * @Project: JavaStudyDemo
 * @ClassName Nap
 * @description: TODO
 * @author: leospiritlee
 * @create: 2020-02-18 16:01
 **/
public class Nap {

    public Nap(int sleepTime) {
        try {
            Thread.sleep(sleepTime * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
