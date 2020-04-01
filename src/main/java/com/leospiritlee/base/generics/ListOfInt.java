package com.leospiritlee.base.generics;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * @Project: JavaStudyDemo
 * @ClassName ListOfInt
 * @description: TODO
 * @author: leospiritlee
 * @create: 2020-04-01 21:16
 **/
public class ListOfInt {

    public static void main(String[] args) {
        List<Integer> li = IntStream.range(38, 48)
                .boxed() // Converts ints to Integers
                .collect(Collectors.toList());
        System.out.println(li);
    }
}
