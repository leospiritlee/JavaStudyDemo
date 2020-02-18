package com.leospiritlee.base;

/**
 * @Project: JavaStudyDemo
 * @ClassName OptionalTrailingArguments
 * @description: TODO
 * @author: leospiritlee
 * @create: 2020-02-18 21:29
 **/
public class OptionalTrailingArguments {

    static void f(int required, String... trailing) {
        System.out.print("required: " + required + " ");
        for (String s: trailing) {
            System.out.print(s + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        f(1, "one");
        f(2, "two", "three");
        f(0);
    }
}
