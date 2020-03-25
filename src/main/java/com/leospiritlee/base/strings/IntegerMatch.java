package com.leospiritlee.base.strings;

/**
 * @Project: JavaStudyDemo
 * @ClassName IntegerMatch
 * @description: TODO
 * @author: leospiritlee
 * @create: 2020-03-25 21:21
 **/
public class IntegerMatch {

    public static void main(String[] args) {
        System.out.println("-1234".matches("-?\\d+"));
        System.out.println("5678".matches("-?\\d+"));
        System.out.println("+911".matches("-?\\d+"));
        System.out.println("+911".matches("(-|\\+)?\\d+"));
    }

}
