package com.leospiritlee.base.innerclasses;

import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;

/**
 * @Project: JavaStudyDemo
 * @ClassName Parcel11
 * @description: TODO
 * @author: leospiritlee
 * @create: 2020-02-26 17:37
 **/
public class Parcel11 {

    private static class ParcelContents implements Contents {

        private int i = 11;

        @Override
        public int value() { return i; }
    }

    protected static final class ParcelDestination implements Destination {

        private String label;
        private ParcelDestination(String whereTo) {
            label = whereTo;
        }

        @Override
        public String readLabel() { return label; }

        // Nested classes can contain other static elements:
        public static void f() {}
        static int x = 10;
        static class AnotherLevel {
            public static void f() {
                System.out.println("AnotherLevel f()");
            }
            static int x = 10;
        }
    }

    public static Destination destination(String s) {
        return new ParcelDestination(s);
    }

    public static Contents contents() {
        return new ParcelContents();
    }

    public static void main(String[] args) {
        Contents c = contents();
        System.out.println(c.value());
        Destination d = destination("Tasmania");
        System.out.println(d.readLabel());

        ParcelDestination.AnotherLevel.f();
        System.out.println(ParcelDestination.AnotherLevel.x);
    }

}
