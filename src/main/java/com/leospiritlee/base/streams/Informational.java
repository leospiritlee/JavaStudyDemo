package com.leospiritlee.base.streams;

/**
 * @Project: JavaStudyDemo
 * @ClassName Informational
 * @description: TODO
 * @author: leospiritlee
 * @create: 2020-03-13 21:12
 **/
public class Informational {

    public static void  main(String[] args) throws Exception {
        System.out.println(
                FileToWords.stream("src\\main\\java\\com\\leospiritlee\\base\\streams\\Cheese.dat")
                        .count());
        System.out.println(
                FileToWords.stream("src\\main\\java\\com\\leospiritlee\\base\\streams\\Cheese.dat")
                        .min(String.CASE_INSENSITIVE_ORDER)
                        .orElse("NONE"));
        System.out.println(
                FileToWords.stream("src\\main\\java\\com\\leospiritlee\\base\\streams\\Cheese.dat")
                        .max(String.CASE_INSENSITIVE_ORDER)
                        .orElse("NONE"));
    }

}
