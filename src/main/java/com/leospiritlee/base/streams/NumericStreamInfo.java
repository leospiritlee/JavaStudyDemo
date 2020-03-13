package com.leospiritlee.base.streams;

import static com.leospiritlee.base.streams.RandInts.rands;

/**
 * @Project: JavaStudyDemo
 * @ClassName NumericStreamInfo
 * @description: TODO
 * @author: leospiritlee
 * @create: 2020-03-13 21:39
 **/
public class NumericStreamInfo {

    public static void main(String[] args) {
        System.out.println(rands().average().getAsDouble());
        System.out.println(rands().max().getAsInt());
        System.out.println(rands().min().getAsInt());
        System.out.println(rands().sum());
        System.out.println(rands().summaryStatistics());
    }

}
