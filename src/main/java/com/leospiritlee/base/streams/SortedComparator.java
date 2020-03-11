package com.leospiritlee.base.streams;

import java.util.Comparator;

/**
 * @Project: JavaStudyDemo
 * @ClassName SortedComparator
 * @description: TODO
 * @author: leospiritlee
 * @create: 2020-03-11 21:38
 **/
public class SortedComparator {

    public static void main(String[] args) throws Exception {
        FileToWords.stream("src\\main\\java\\com\\leospiritlee\\base\\streams\\Cheese.dat")
                .skip(10)
                .limit(10)
                .sorted(Comparator.reverseOrder())
                .map(w -> w + " ")
                .forEach(System.out::print);
    }

}
