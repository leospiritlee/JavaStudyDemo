package com.leospiritlee.base.interfaces.filters;

/**
 * @Project: JavaStudyDemo
 * @ClassName BandPass
 * @description: TODO
 * @author: leospiritlee
 * @create: 2020-02-25 15:47
 **/
public class BandPass extends Filter {
    double lowCutoff, highCutoff;

    public BandPass(double lowCut, double highCut) {
        lowCutoff = lowCut;
        highCutoff = highCut;
    }

    @Override
    public Waveform process(Waveform input) {
        return input;
    }
}
