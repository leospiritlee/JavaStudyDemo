package com.leospiritlee.base.innerclasses;

/**
 * @Project: JavaStudyDemo
 * @ClassName Parcel9
 * @description: TODO
 * @author: leospiritlee
 * @create: 2020-02-26 14:14
 **/
public class Parcel9 {

    // Argument must be final or "effectively final"
    // to use within the anonymous inner class:
    public Destination destination(final String dest) {
        return new Destination() {
            private String label = dest;
            @Override
            public String readLabel() { return label; }
        };
    }

    public Contents contents(final int value){
        return new Contents() {
            private int val = value;
            @Override
            public int value() {
                return val;
            }
        };
    }

    public static void main(String[] args) {
        Parcel9 p = new Parcel9();
        Destination d = p.destination("Tasmania");
        System.out.println(d.readLabel());
        Contents c = p.contents(11);
        System.out.println(c.value());
    }

}
