package com.leospiritlee.base.interfaces.filters;

/**
 * @Project: JavaStudyDemo
 * @ClassName Filter
 * @description: TODO
 * @author: leospiritlee
 * @create: 2020-02-25 15:46
 **/
public class Filter {

    public String name() {
        return getClass().getSimpleName();
    }

    public Waveform process(Waveform input) {
        return input;
    }

}
