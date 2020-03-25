package com.leospiritlee.base.strings;

/**
 * @Project: JavaStudyDemo
 * @ClassName Replacing
 * @description: TODO
 * @author: leospiritlee
 * @create: 2020-03-25 21:25
 **/
public class Replacing {

    static String s = Splitting.knights;
    public static void main(String[] args) {
        System.out.println(
                s.replaceFirst("f\\w+", "located"));
        System.out.println(
                s.replaceAll("shrubbery|tree|herring","banana"));
    }

}
