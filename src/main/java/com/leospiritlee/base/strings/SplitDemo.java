package com.leospiritlee.base.strings;

import java.util.Arrays;
import java.util.regex.Pattern;

/**
 * @Project: JavaStudyDemo
 * @ClassName SplitDemo
 * @description: TODO
 * @author: leospiritlee
 * @create: 2020-03-25 22:03
 **/
public class SplitDemo {

    public static void main(String[] args) {
        String input =
                "This!!unusual use!!of exclamation!!points";
        System.out.println(Arrays.toString(
                Pattern.compile("!!").split(input)));
        // Only do the first three:
        System.out.println(Arrays.toString(
                Pattern.compile("!!").split(input, 3)));
    }

}
