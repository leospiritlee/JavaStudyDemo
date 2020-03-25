package com.leospiritlee.base.strings;

/**
 * @Project: JavaStudyDemo
 * @ClassName Immutable
 * @description: TODO
 * @author: leospiritlee
 * @create: 2020-03-25 18:49
 **/
public class Immutable {

    public static String upcase(String s) {
        return s.toUpperCase();
    }

    public static void main(String[] args) {
        String q = "howdy";
        System.out.println(q); // howdy
        String qq = upcase(q);
        System.out.println(qq); // HOWDY
        System.out.println(q); // howdy

        int x = 1;
        double y = 0.01;

        System.out.printf("Row 1: [%d %f]%n", x, y);
    }

}
