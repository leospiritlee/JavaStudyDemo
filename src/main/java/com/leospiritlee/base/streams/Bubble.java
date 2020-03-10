package com.leospiritlee.base.streams;

/**
 * @Project: JavaStudyDemo
 * @ClassName Bubble
 * @description: TODO
 * @author: leospiritlee
 * @create: 2020-03-10 21:29
 **/
public class Bubble {

    public final int i;

    public Bubble(int n) {
        i = n;
    }

    @Override
    public String toString() {
        return "Bubble(" + i + ")";
    }

    private static int count = 0;
    public static Bubble bubbler() {
        return new Bubble(count++);
    }

}
