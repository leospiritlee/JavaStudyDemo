package com.leospiritlee.base.strings;

import java.util.Random;
import java.util.stream.Collectors;

/**
 * @Project: JavaStudyDemo
 * @ClassName UsingStringBuilder
 * @description: TODO
 * @author: leospiritlee
 * @create: 2020-03-25 20:11
 **/
public class UsingStringBuilder {

    public static String string1() {
        Random rand = new Random(47);
        StringBuilder result = new StringBuilder("[");
        for(int i = 0; i < 25; i++) {
            result.append(rand.nextInt(100));
            result.append(", ");
        }
        result.delete(result.length()-2, result.length());
        result.append("]");
        return result.toString();
    }

    public static String string2() {
        String result = new Random(47)
                .ints(25, 0, 100)
                .mapToObj(Integer::toString)
                .collect(Collectors.joining(", "));
        return "[" + result + "]";
    }

    public static void main(String[] args) {
        System.out.println(string1());
        System.out.println(string2());
    }

}
