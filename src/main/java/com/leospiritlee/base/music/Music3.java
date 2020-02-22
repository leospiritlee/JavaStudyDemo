package com.leospiritlee.base.music;

/**
 * @Project: JavaStudyDemo
 * @ClassName Music3
 * @description: TODO
 * @author: leospiritlee
 * @create: 2020-02-22 17:16
 **/
public class Music3 {

    // Doesn't care about type, so new types
    // added to the system still work right:
    public static void tune(Instrument i) {
        // ...
        i.play(Note.MIDDLE_C);
    }

    public static void tuneAll(Instrument[] e) {
        for (Instrument i: e) {
            tune(i);
        }
    }

    public static void main(String[] args) {
        // Upcasting during addition to the array:
        Instrument[] orchestra = {
                new Wind(),
                new Percussion(),
                new Stringed(),
                new Brass(),
                new Woodwind()
        };
        tuneAll(orchestra);
    }
}
