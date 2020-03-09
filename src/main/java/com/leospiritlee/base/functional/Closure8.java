package com.leospiritlee.base.functional;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

/**
 * @Project: JavaStudyDemo
 * @ClassName Closure8
 * @description: TODO
 * @author: leospiritlee
 * @create: 2020-03-09 22:27
 **/
public class Closure8 {

    Supplier<List<Integer>> makeFun() {
        final List<Integer> ai = new ArrayList<>();
        ai.add(1);
        return () -> ai;
    }
    public static void main(String[] args) {
        Closure8 c8 = new Closure8();
        List<Integer>
                l1 = c8.makeFun().get(),
                l2 = c8.makeFun().get();
        System.out.println(l1);
        System.out.println(l2);
        l1.add(42);
        l2.add(96);
        System.out.println(l1);
        System.out.println(l2);
    }

}
