package com.leospiritlee.base.innerclasses;

/**
 * @Project: JavaStudyDemo
 * @ClassName TestParcel
 * @description: TODO
 * @author: leospiritlee
 * @create: 2020-02-25 21:20
 **/
public class TestParcel {

    public static void main(String[] args) {
        Parcel4 p = new Parcel4();
        Contents c = p.contents();
        Destination d = p.destination("Tasmania");
        // Illegal -- can't access private class:
        //- Parcel4.PContents pc = p.new PContents();

        System.out.println(c.value());
        System.out.println(d.readLabel());
    }

}

class Parcel4 {

    private class PContents implements Contents {
        private int i = 11;
        @Override
        public int value() { return i; }
    }

    protected final class PDestination implements Destination {
        private String label;
        private PDestination(String whereTo) {
            label = whereTo;
        }
        @Override
        public String readLabel() { return label; }
    }

    public Destination destination(String s) {
        return new PDestination(s);
    }
    public Contents contents() {
        return new PContents();
    }
}
