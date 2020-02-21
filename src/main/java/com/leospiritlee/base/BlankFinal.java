package com.leospiritlee.base;

/**
 * @Project: JavaStudyDemo
 * @ClassName BlankFinal
 * @description: TODO
 * @author: leospiritlee
 * @create: 2020-02-21 13:37
 **/
public class BlankFinal {

    private final int i = 0; // Initialized final
    private final int j; // Blank final
    private final Poppet p; // Blank final reference
    // Blank finals MUST be initialized in constructor
    public BlankFinal() {
        j = 1; // Initialize blank final
        p = new Poppet(1); // Init blank final reference
    }

    public BlankFinal(int x) {
        j = x; // Initialize blank final
        p = new Poppet(x); // Init blank final reference
    }

    public static void main(String[] args) {
        BlankFinal blankFinal = new BlankFinal();
        System.out.println(blankFinal.i);
        System.out.println(blankFinal.j);
        System.out.println(blankFinal.p);

        BlankFinal blankFinal2 =new BlankFinal(47);

        System.out.println(blankFinal2.i);
        System.out.println(blankFinal2.j);
        System.out.println(blankFinal2.p);
    }

}

class Poppet {
    private int i;

    Poppet(int ii) {
        i = ii;
    }

    @Override
    public String toString() {
        return "Poppet{" +
                "i=" + i +
                '}';
    }
}
