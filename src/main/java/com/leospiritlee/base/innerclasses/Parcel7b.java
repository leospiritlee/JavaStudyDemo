package com.leospiritlee.base.innerclasses;

/**
 * @Project: JavaStudyDemo
 * @ClassName Parcel7b
 * @description: TODO
 * @author: leospiritlee
 * @create: 2020-02-26 14:05
 **/
public class Parcel7b {

    class MyContents implements Contents {
        private int i = 11;
        @Override
        public int value() { return i; }
    }

    class MyDestination implements Destination{

        private String label;

        public MyDestination(String labelValue) {
            this.label = labelValue;
        }

        @Override
        public String readLabel() {
            return label;
        }
    }

    public Contents contents() {
        return new MyContents();
    }

    public Destination destination(String label){
        return new MyDestination(label);
    }

    public static void main(String[] args) {
        Parcel7b p = new Parcel7b();
        Contents c = p.contents();
        System.out.println(c.value());

        Destination d = p.destination("test");
        System.out.println(d.readLabel());
    }

}
