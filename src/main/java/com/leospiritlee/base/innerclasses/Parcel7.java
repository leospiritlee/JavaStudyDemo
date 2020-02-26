package com.leospiritlee.base.innerclasses;

/**
 * @Project: JavaStudyDemo
 * @ClassName Parcel7
 * @description: TODO
 * @author: leospiritlee
 * @create: 2020-02-26 13:25
 **/
public class Parcel7 {

    public Contents contents() {
        return new Contents() { // Insert class definition
            private int i = 11;

            @Override
            public int value() { return i; }
        }; // Semicolon required
    }

    public Destination destination(String labelValue){
        return new Destination() {

            @Override
            public String readLabel() {
                return labelValue;
            }
        };
    }


    public static void main(String[] args) {
        Parcel7 p = new Parcel7();
        Contents c = p.contents();
        System.out.println(c.value());

        Destination d = p.destination("test");
        System.out.println(d.readLabel());
    }

}
