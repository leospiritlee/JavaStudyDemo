package com.leospiritlee.base.music;

/**
 * @Project: JavaStudyDemo
 * @ClassName Wind
 * @description: TODO
 * @author: leospiritlee
 * @create: 2020-02-22 16:25
 **/
public class Wind extends Instrument  {

    @Override
    public void play(Note n) {
        System.out.println("Wind.play() " + n);
    }

    @Override
    String what() {
        return "Wind";
    }
    @Override
    void adjust() {
        System.out.println("Adjusting Wind");
    }
}
