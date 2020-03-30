package com.leospiritlee.base.generics;

import java.util.ArrayList;
import java.util.List;

/**
 * @Project: JavaStudyDemo
 * @ClassName GenericVarargs
 * @description: TODO
 * @author: leospiritlee
 * @create: 2020-03-30 21:13
 **/
public class GenericVarargs {

    @SafeVarargs
    public static <T> List<T> makeList(T... args) {
        List<T> result = new ArrayList<>();
        for (T item : args)
            result.add(item);
        return result;
    }

    public static void main(String[] args) {
        List<String> ls = makeList("A");
        System.out.println(ls);
        ls = makeList("A", "B", "C");
        System.out.println(ls);
        ls = makeList(
                "ABCDEFFHIJKLMNOPQRSTUVWXYZ".split(""));
        System.out.println(ls);
    }

}
