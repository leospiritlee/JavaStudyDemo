package com.leospiritlee.base.innerclasses;

/**
 * @Project: JavaStudyDemo
 * @ClassName Parcel2
 * @description: TODO
 * @author: leospiritlee
 * @create: 2020-02-25 20:21
 *
 * 具体地指明这个对象的类型：OuterClassName.InnerClassName。
 * (译者注：在外部类的静态方法中也可以直接指明类型 InnerClassName，在其他类中需要指明 OuterClassName.InnerClassName。)
 **/
public class Parcel2 {

    class Contents {
        private int i = 11;

        public int value() { return i; }
    }

    class Destination {
        private String label;

        Destination(String whereTo) {
            label = whereTo;
        }

        String readLabel() { return label; }
    }

    public Destination to(String s) {
        return new Destination(s);
    }

    public Contents contents() {
        return new Contents();
    }

    public void ship(String dest) {
        Contents c = contents();
        System.out.println(c.value());
        Destination d = to(dest);
        System.out.println(d.readLabel());
    }

    public static void main(String[] args) {
        Parcel2 p = new Parcel2();
        p.ship("Tasmania");
        Parcel2 q = new Parcel2();
        // Defining references to inner classes:
        Parcel2.Contents c = q.contents();
        System.out.println(c.value());
        Parcel2.Destination d = q.to("Borneo");
        System.out.println(d.readLabel());
    }

}
