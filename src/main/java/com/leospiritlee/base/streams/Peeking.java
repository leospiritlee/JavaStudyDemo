package com.leospiritlee.base.streams;

/**
 * @Project: JavaStudyDemo
 * @ClassName Peeking
 * @description: TODO
 * @author: leospiritlee
 * @create: 2020-03-11 21:18
 **/
public class Peeking {

    public static void main(String[] args) throws Exception {
        FileToWords.stream("src\\main\\java\\com\\leospiritlee\\base\\streams\\Cheese.dat")
                .skip(21)
                .limit(4)
                .map(w -> w + " ")
                .peek(System.out::println)
                .map(String::toUpperCase)
                .peek(System.out::println)
                .map(String::toLowerCase)
                .forEach(System.out::println);
    }

}
