package com.leospiritlee.base.streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

/**
 * @Project: JavaStudyDemo
 * @ClassName OptionalFilter
 * @description: TODO
 * @author: leospiritlee
 * @create: 2020-03-12 21:20
 **/
public class OptionalFilter {

    static String[] elements = {
            "Foo", "", "Bar", "Baz", "Bingo"
    };
    static Stream<String> testStream() {
        return Arrays.stream(elements);
    }
    static void test(String descr, Predicate<String> pred) {
        System.out.println(" ---( " + descr + " )---");
        for(int i = 0; i <= elements.length; i++) {
            System.out.println(
                    testStream()
                            .skip(i)
                            .findFirst()
                            .filter(pred));
        }
    }
    public static void main(String[] args) {
        test("true", str -> true);
        test("false", str -> false);
        test("str != \"\"", str -> str != "");
        test("str.length() == 3", str -> str.length() == 3);
        test("startsWith(\"B\")",
                str -> str.startsWith("B"));

        System.out.println("----------------");

        testStream().limit(2).forEach(s -> {
            System.out.println("s:" + s);
        });

        System.out.println("----------------");
        Arrays.asList(elements).stream().forEach(e ->{
            System.out.println(e);
        });

        System.out.println("----------------");
        List<String> elelist = Arrays.asList(elements);
        for(int i = 0, size =  elelist.size(); i < size; i++){
             String result = elelist.stream().skip(i).findFirst().get();
             System.out.println("result:" + result);
        }
    }

}
