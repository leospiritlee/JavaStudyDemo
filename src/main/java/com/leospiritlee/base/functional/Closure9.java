package com.leospiritlee.base.functional;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

/**
 * @Project: JavaStudyDemo
 * @ClassName Closure9
 * @description: TODO
 * @author: leospiritlee
 * @create: 2020-03-09 22:30
 **/
public class Closure9 {

    Supplier<List<Integer>> makeFun() {
        List<Integer> ai = new ArrayList<>();
        ai = new ArrayList<>(); // Reassignment
        List<Integer> finalAi = ai;
        return () -> finalAi;
    }

}
