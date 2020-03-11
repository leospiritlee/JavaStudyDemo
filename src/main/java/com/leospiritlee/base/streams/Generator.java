package com.leospiritlee.base.streams;

import java.util.Random;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @Project: JavaStudyDemo
 * @ClassName Generator
 * @description: TODO
 * @author: leospiritlee
 * @create: 2020-03-11 14:31
 **/
public class Generator implements Supplier<String> {

    Random rand = new Random(47);
    char[] letters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();


    @Override
    public String get() {
        return "" + letters[rand.nextInt(letters.length)];
    }

    public static void main(String[] args) {
        String word = Stream.generate(new Generator())
                .limit(30)
                .collect(Collectors.joining(" "));
        System.out.println(word);
    }

}
