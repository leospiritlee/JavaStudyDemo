package com.leospiritlee.base.strings;

import java.util.Arrays;

/**
 * @Project: JavaStudyDemo
 * @ClassName Splitting
 * @description: TODO
 * @author: leospiritlee
 * @create: 2020-03-25 21:22
 **/
public class Splitting {

    public static String knights =
            "Then, when you have found the shrubbery, " +
                    "you must cut down the mightiest tree in the " +
                    "forest...with... a herring!";
    public static void split(String regex) {
        System.out.println(
                Arrays.toString(knights.split(regex)));
    }
    public static void main(String[] args) {
        split(" "); // Doesn't have to contain regex chars
        System.out.println("--------------------");
        split("\\W+"); // Non-word characters
        System.out.println("--------------------");
        split("n\\W+"); // 'n' followed by non-words
        System.out.println("--------------------");
    }

}
