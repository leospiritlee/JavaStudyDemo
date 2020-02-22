package com.leospiritlee.base.music;

/**
 * @Project: JavaStudyDemo
 * @ClassName Instrument
 * @description: TODO
 * @author: leospiritlee
 * @create: 2020-02-22 16:25
 **/
public class Instrument {

    public void play(Note n) {
        System.out.println("Instrument.play()");
    }

    String what() {
        return "Instrument";
    }

    void adjust() {
        System.out.println("Adjusting Instrument");
    }
}
