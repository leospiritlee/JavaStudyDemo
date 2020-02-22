package com.leospiritlee.base.music;

/**
 * @Project: JavaStudyDemo
 * @ClassName Percussion
 * @description: TODO
 * @author: leospiritlee
 * @create: 2020-02-22 17:15
 **/
public class Percussion extends Instrument {

    @Override
    public void play(Note n) {
        System.out.println("Percussion.play() " + n);
    }

    @Override
    String what() {
        return "Percussion";
    }

    @Override
    void adjust() {
        System.out.println("Adjusting Percussion");
    }
}
