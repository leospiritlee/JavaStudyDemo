package com.leospiritlee.base.onjava;

import java.util.concurrent.TimeUnit;

/**
 * @Project: JavaStudyDemo
 * @ClassName Nap
 * @description: TODO
 * @author: leospiritlee
 * @create: 2020-04-12 11:47
 **/
public class Nap {

    public Nap(double t) { // Seconds
        try {
            TimeUnit.MILLISECONDS.sleep((int)(1000 * t));
        } catch(InterruptedException e){
            throw new RuntimeException(e);
        }
    }
    public Nap(double t, String msg) {
        this(t);
        System.out.println(msg);
    }

}
