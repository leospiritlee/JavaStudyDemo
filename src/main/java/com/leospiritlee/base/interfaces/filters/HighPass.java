package com.leospiritlee.base.interfaces.filters;

/**
 * @Project: JavaStudyDemo
 * @ClassName HighPass
 * @description: TODO
 * @author: leospiritlee
 * @create: 2020-02-25 15:47
 **/
public class HighPass extends Filter {
    double cutoff;

    public HighPass(double cutoff) {
        this.cutoff = cutoff;
    }

    @Override
    public Waveform process(Waveform input) {
        return input;
    }
}
