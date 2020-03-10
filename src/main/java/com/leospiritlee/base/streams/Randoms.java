package com.leospiritlee.base.streams;

import java.util.Random;

/**
 * @Project: JavaStudyDemo
 * @ClassName Randoms
 * @description: TODO
 * @author: leospiritlee
 * @create: 2020-03-10 10:01
 **/
public class Randoms {

    public static void main(String[] args) {
        new Random(47)
                .ints(5, 20)
                .distinct()
                .limit(7)
                .sorted()
                .forEach(System.out::println);
    }
}
