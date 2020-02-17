package com.leospiritlee.base;

/**
 * @Project: JavaStudyDemo
 * @ClassName AutoInc
 * @description: TODO
 * @author: leospiritlee
 * @create: 2020-02-16 11:15
 **/
public class AutoInc {

    public static void main(String[] args) {
        int i = 1;
        System.out.println("i: " + i);
        System.out.println("++i: " + ++i); // 前递增
        System.out.println("i++: " + i++); // 后递增
        System.out.println("i: " + i);
        System.out.println("--i: " + --i); // 前递减
        System.out.println("i--: " + i--); // 后递减
        System.out.println("i: " + i);
    }

}
