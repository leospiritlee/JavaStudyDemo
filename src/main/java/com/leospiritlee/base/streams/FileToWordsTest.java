package com.leospiritlee.base.streams;

/**
 * @Project: JavaStudyDemo
 * @ClassName FileToWordsTest
 * @description: TODO
 * @author: leospiritlee
 * @create: 2020-03-12 14:09
 **/
public class FileToWordsTest {

    public static void main(String[] args) throws Exception {
        FileToWords.stream("src\\main\\java\\com\\leospiritlee\\base\\streams\\Cheese.dat")
                .limit(7)
                .forEach(s -> System.out.format("%s ", s));
        System.out.println();
        FileToWords.stream("src\\main\\java\\com\\leospiritlee\\base\\streams\\Cheese.dat")
                .skip(7)
                .limit(2)
                .forEach(s -> System.out.format("%s ", s));
    }

}
