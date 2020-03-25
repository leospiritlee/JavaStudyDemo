package com.leospiritlee.base.strings;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @Project: JavaStudyDemo
 * @ClassName Finding
 * @description: TODO
 * @author: leospiritlee
 * @create: 2020-03-25 21:45
 **/
public class Finding {
    public static void main(String[] args) {
        Matcher m = Pattern.compile("\\w+")
                .matcher(
                        "Evening is full of the linnet's wings");
        while(m.find())
            System.out.print(m.group() + " ");
        System.out.println();
        int i = 0;
        while(m.find(i)) {
            System.out.print(m.group() + " ");
            i++;
        }
    }
}
