package com.leospiritlee.base.strings;

/**
 * @Project: JavaStudyDemo
 * @ClassName Rudolph
 * @description: TODO
 * @author: leospiritlee
 * @create: 2020-03-25 21:34
 **/
public class Rudolph {

    public static void main(String[] args) {
        for(String pattern : new String[]{
                "Rudolph",
                "[rR]udolph",
                "[rR][aeiou][a-z]ol.*",
                "R.*" })
            System.out.println("Rudolph".matches(pattern));
    }

}
