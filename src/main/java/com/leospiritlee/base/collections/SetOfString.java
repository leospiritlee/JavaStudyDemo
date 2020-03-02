package com.leospiritlee.base.collections;

import java.util.HashSet;
import java.util.Set;

/**
 * @Project: JavaStudyDemo
 * @ClassName SetOfString
 * @description: TODO
 * @author: leospiritlee
 * @create: 2020-03-02 10:29
 **/
public class SetOfString {

    public static void main(String[] args) {
        Set<String> colors = new HashSet<>();
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
