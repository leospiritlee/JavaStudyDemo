package com.leospiritlee.base.music;

/**
 * @Project: JavaStudyDemo
 * @ClassName Woodwind
 * @description: TODO
 * @author: leospiritlee
 * @create: 2020-02-22 17:16
 **/
public class Woodwind extends Wind {

    @Override
    public void play(Note n) {
        System.out.println("Woodwind.play() " + n);
    }
    @Override
    String what() {
        return "Woodwind";
    }
}