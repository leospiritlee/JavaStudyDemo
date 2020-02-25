package com.leospiritlee.base.interfaces.filters;

/**
 * @Project: JavaStudyDemo
 * @ClassName Waveform
 * @description: TODO
 * @author: leospiritlee
 * @create: 2020-02-25 15:46
 **/
public class Waveform {

    private static long counter;
    private final long id = counter++;

    @Override
    public String toString() {
        return "Waveform " + id;
    }

}
