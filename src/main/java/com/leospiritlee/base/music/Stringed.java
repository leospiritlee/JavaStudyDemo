package com.leospiritlee.base.music;

/**
 * @Project: JavaStudyDemo
 * @ClassName Stringed
 * @description: TODO
 * @author: leospiritlee
 * @create: 2020-02-22 16:31
 **/
public class Stringed extends Instrument {

    @Override
    public void play(Note n) {
        System.out.println("Stringed.play() " + n);
    }

    @Override
    String what() {
        return "Stringed";
    }
    @Override
    void adjust() {
        System.out.println("Adjusting Stringed");
    }
}
