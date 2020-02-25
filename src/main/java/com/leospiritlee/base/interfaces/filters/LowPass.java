package com.leospiritlee.base.interfaces.filters;

/**
 * @Project: JavaStudyDemo
 * @ClassName LowPass
 * @description: TODO
 * @author: leospiritlee
 * @create: 2020-02-25 15:47
 **/
public class LowPass extends Filter {

    double cutoff;

    public LowPass(double cutoff) {
        this.cutoff = cutoff;
    }

    @Override
    public Waveform process(Waveform input) {
        return input; // Dummy processing 哑处理
    }

}
