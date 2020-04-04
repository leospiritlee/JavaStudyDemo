package com.leospiritlee.base.arrays;

import java.util.Arrays;
import java.util.SplittableRandom;

/**
 * @Project: JavaStudyDemo
 * @ClassName RaggedArray
 * @description: TODO
 * @author: leospiritlee
 * @create: 2020-04-04 10:53
 **/
public class RaggedArray {

    static int val = 1;
    public static void main(String[] args) {
        SplittableRandom rand = new SplittableRandom(47);
        // 3-D array with varied-length vectors:
        int[][][] a = new int[rand.nextInt(7)][][];

        System.out.println("before:" + Arrays.deepToString(a));

        for(int i = 0; i < a.length; i++) {
            a[i] = new int[rand.nextInt(5)][];

            System.out.println("a["+i+"]:" + Arrays.deepToString(a));

            for(int j = 0; j < a[i].length; j++) {
                System.out.println("a["+i+"]["+j+"] before :" + Arrays.deepToString(a));

                a[i][j] = new int[rand.nextInt(5)];
                /**
                 *  Java 8 增加了 Arrays.setAll() 方法,其使用生成器来生成插入数组中的值。
                 *  此生成器符合函数式接口 IntUnaryOperator ，只使用一个非 默认 的方法 ApplyAsInt(int操作数) 。
                 *  Arrays.setAll() 传递当前数组索引作为操作数，
                 *  因此一个选项是提供 n -> n 的 lambda 表达式来显示数组的索引（在上面的代码中很容易尝试）。
                 *  这里，我们忽略索引，只是插入递增计数器的值。
                 */
                Arrays.setAll(a[i][j], n -> val++); // [1]
                System.out.println("a["+i+"]["+j+"] after :" + Arrays.deepToString(a));
            }
        }
        System.out.println("after:" + Arrays.deepToString(a));
    }

}
