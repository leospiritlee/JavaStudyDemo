package com.leospiritlee.base.functional;

/**
 * @Project: JavaStudyDemo
 * @ClassName TriFunctionTest
 * @description: TODO
 * @author: leospiritlee
 * @create: 2020-03-08 14:02
 **/
public class TriFunctionTest {

    static int f(int i, long l, double d) { return 99; }
    public static void main(String[] args) {
        TriFunction<Integer, Long, Double, Integer> tf =
                TriFunctionTest::f;
        tf = (i, l, d) -> 12;
    }
}
