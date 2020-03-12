package com.leospiritlee.base.streams;

import java.util.Optional;

/**
 * @Project: JavaStudyDemo
 * @ClassName CreatingOptionals
 * @description: TODO
 * @author: leospiritlee
 * @create: 2020-03-12 21:12
 **/
public class CreatingOptionals {


    static void test(String testName, Optional<String> opt) {
        System.out.println(" === " + testName + " === ");
        System.out.println(opt.orElse("Null"));
    }
    public static void main(String[] args) {
        test("empty", Optional.empty());
        test("of", Optional.of("Howdy"));
        System.out.println("----");
        try {
            test("of", Optional.of(null));
        } catch(Exception e) {
            System.out.println(e);
        }
        test("ofNullable", Optional.ofNullable("Hi"));
        test("ofNullable", Optional.ofNullable(null));
    }

}
