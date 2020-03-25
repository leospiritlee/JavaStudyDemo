package com.leospiritlee.base.strings;

/**
 * @Project: JavaStudyDemo
 * @ClassName SimpleFormat
 * @description: TODO
 * @author: leospiritlee
 * @create: 2020-03-25 20:45
 **/
public class SimpleFormat {

    public static void main(String[] args) {
        int x = 5;
        double y = 5.332542;
        // The old way:
        System.out.println("Row 1: [" + x + " " + y + "]");
        // The new way:
        System.out.format("Row 2: [%d %f]%n", x, y);
        // or
        System.out.printf("Row 3: [%d %f]%n", x, y);


        String s = "Row 4: [%d %f]%n";
        System.out.println(String.format(s, x, y));
    }

}
