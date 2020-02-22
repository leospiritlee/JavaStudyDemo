package com.leospiritlee.base.music;

/**
 * @Project: JavaStudyDemo
 * @ClassName Music
 * @description: TODO
 * @author: leospiritlee
 * @create: 2020-02-22 16:25
 **/
public class Music {

    public static void tune(Instrument i) {
        // ...
        i.play(Note.MIDDLE_C);
    }

    public static void main(String[] args) {
        Wind flute = new Wind();
        tune(flute); // Upcasting

        Stringed violin = new Stringed();
        tune(violin); // Upcasting
        Brass frenchHorn = new Brass();
        tune(frenchHorn); // Upcasting
    }
}
