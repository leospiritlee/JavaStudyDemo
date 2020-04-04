package com.leospiritlee.base.arrays;

import java.util.Arrays;

/**
 * @Project: JavaStudyDemo
 * @ClassName MultidimensionalPrimitiveArray
 * @description: TODO
 * @author: leospiritlee
 * @create: 2020-04-04 10:41
 **/
public class MultidimensionalPrimitiveArray {

    public static void main(String[] args) {
        int[][] a = {
                { 1, 2, 3, },
                { 4, 5, 6, },
        };
        System.out.println(Arrays.deepToString(a));
        System.out.println(Arrays.toString(a));
    }

}
