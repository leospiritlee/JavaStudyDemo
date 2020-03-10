package com.leospiritlee.base.streams;

import static java.util.stream.IntStream.range;

/**
 * @Project: JavaStudyDemo
 * @ClassName Ranges
 * @description: TODO
 * @author: leospiritlee
 * @create: 2020-03-10 22:26
 **/
public class Ranges {

    /**
     * 10 -19 之间连续数字相加
     * @param args
     */
    public static void main(String[] args) {
        // 传统方法:
        int result = 0;
        for (int i = 10; i < 20; i++){
            result += i;
        }

        System.out.println(result);

        // for-in 循环:
        result = 0;
        /** range 返回 IntStream
         *  for (int i = startInclusive; i < endExclusive ; i++) { ... }
         */
        for (int i : range(10, 20).toArray()){
            result += i;
        }

        System.out.println(result);

        // 使用流:
        System.out.println(range(10, 20).sum());
    }

}
