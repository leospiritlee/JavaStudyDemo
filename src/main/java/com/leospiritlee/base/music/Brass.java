package com.leospiritlee.base.music;

/**
 * @Project: JavaStudyDemo
 * @ClassName Brass
 * @description: TODO
 * @author: leospiritlee
 * @create: 2020-02-22 16:32
 **/
public class Brass extends Wind {

    @Override
    public void play(Note n) {
        System.out.println("Brass.play() " + n);
    }
    @Override
    void adjust() {
        System.out.println("Adjusting Brass");
    }
}
