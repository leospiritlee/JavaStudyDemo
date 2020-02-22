package com.leospiritlee.base.music;

/**
 * @Project: JavaStudyDemo
 * @ClassName Music2
 * @description: TODO
 * @author: leospiritlee
 * @create: 2020-02-22 16:32
 **/
public class Music2 {

    public static void tune(Wind i) {
        i.play(Note.MIDDLE_C);
    }

    public static void tune(Stringed i) {
        i.play(Note.MIDDLE_C);
    }

    public static void tune(Brass i) {
        i.play(Note.MIDDLE_C);
    }

    public static void main(String[] args) {
        Wind flute = new Wind();
        Stringed violin = new Stringed();
        Brass frenchHorn = new Brass();
        tune(flute); // No upcasting
        tune(violin);
        tune(frenchHorn);
    }
}
