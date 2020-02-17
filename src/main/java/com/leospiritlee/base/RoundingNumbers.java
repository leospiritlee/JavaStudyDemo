package com.leospiritlee.base;

/**
 * @Project: JavaStudyDemo
 * @ClassName RoundingNumbers
 * @description: TODO
 * @author: leospiritlee
 * @create: 2020-02-16 13:33
 **/
public class RoundingNumbers {

    public static void main(String[] args) {
        double above = 0.7, below = 0.4;
        float fabove = 0.7f, fbelow = 0.4f;
        System.out.println(
                "Math.round(above): " + Math.round(above));
        System.out.println(
                "Math.round(below): " + Math.round(below));
        System.out.println(
                "Math.round(fabove): " + Math.round(fabove));
        System.out.println(
                "Math.round(fbelow): " + Math.round(fbelow));
    }
}
