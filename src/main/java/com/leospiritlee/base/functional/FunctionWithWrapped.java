package com.leospiritlee.base.functional;

import java.util.function.Function;
import java.util.function.IntToDoubleFunction;

/**
 * @Project: JavaStudyDemo
 * @ClassName FunctionWithWrapped
 * @description: TODO
 * @author: leospiritlee
 * @create: 2020-03-09 14:54
 **/
public class FunctionWithWrapped {

    public static void main(String[] args) {
        Function<Integer, Double> fid = i -> (double)i;
        IntToDoubleFunction fid2 = i -> i;
    }

}
