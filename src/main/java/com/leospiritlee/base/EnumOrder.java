package com.leospiritlee.base;

/**
 * @Project: JavaStudyDemo
 * @ClassName EnumOrder
 * @description: TODO
 * @author: leospiritlee
 * @create: 2020-02-18 21:44
 **/
public class EnumOrder {

    public static void main(String[] args) {
        for (Spiciness s: Spiciness.values()) {
            System.out.println(s + ", ordinal " + s.ordinal());
        }
    }
}
