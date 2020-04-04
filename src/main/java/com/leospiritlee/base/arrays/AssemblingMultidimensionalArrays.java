package com.leospiritlee.base.arrays;

import java.util.Arrays;

/**
 * @Project: JavaStudyDemo
 * @ClassName AssemblingMultidimensionalArrays
 * @description: TODO
 * @author: leospiritlee
 * @create: 2020-04-04 11:16
 **/
public class AssemblingMultidimensionalArrays {

    public static void main(String[] args) {
        Integer[][] a;
        a = new Integer[3][];
        for(int i = 0; i < a.length; i++) {
            a[i] = new Integer[3];
            System.out.println("a["+i+"]:" + Arrays.deepToString(a));
            for(int j = 0; j < a[i].length; j++){
                a[i][j] = i * j; // Autoboxing
                System.out.println("i*j:" + i + "*" + j + "= " + i*j);
                System.out.println("a["+i+"]["+j+"]:" + Arrays.deepToString(a));
            }

        }
        System.out.println(Arrays.deepToString(a));
    }

}
