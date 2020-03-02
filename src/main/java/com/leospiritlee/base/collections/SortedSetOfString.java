package com.leospiritlee.base.collections;

import java.util.Set;
import java.util.TreeSet;

/**
 * @Project: JavaStudyDemo
 * @ClassName SortedSetOfString
 * @description: TODO
 * @author: leospiritlee
 * @create: 2020-03-02 10:31
 **/
public class SortedSetOfString {

    public static void main(String[] args) {
        Set<String> colors = new TreeSet<>();
        for(int i = 0; i < 100; i++) {
            colors.add("Yellow");
            colors.add("Blue");
            colors.add("Red");
            colors.add("Red");
            colors.add("Orange");
            colors.add("Yellow");
            colors.add("Blue");
            colors.add("Purple");
        }
        System.out.println(colors);
    }

}
