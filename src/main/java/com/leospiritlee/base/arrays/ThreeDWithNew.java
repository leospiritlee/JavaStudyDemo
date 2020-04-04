package com.leospiritlee.base.arrays;

import java.util.Arrays;

/**
 * @Project: JavaStudyDemo
 * @ClassName ThreeDWithNew
 * @description: TODO
 * @author: leospiritlee
 * @create: 2020-04-04 10:52
 **/
public class ThreeDWithNew {

    public static void main(String[] args) {
        // 3-D array with fixed length:
        int[][][] a = new int[2][2][4];
        System.out.println(Arrays.deepToString(a));
    }

}
