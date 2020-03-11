package com.leospiritlee.base.streams;

import java.util.Arrays;
import java.util.function.Function;
import java.util.stream.Stream;

/**
 * @Project: JavaStudyDemo
 * @ClassName FunctionMap
 * @description: TODO
 * @author: leospiritlee
 * @create: 2020-03-11 22:01
 **/
public class FunctionMap {

    static String[] elements = { "12", "", "23", "45" };
    static Stream<String>
    testStream() {
        return Arrays.stream(elements);
    }
    static void test(String descr, Function<String, String> func) {
        System.out.println(" ---( " + descr + " )---");
        testStream()
                .map(func)
                .forEach(System.out::println);
    }
    public static void main(String[] args) {
        test("add brackets", s -> "[" + s + "]");
        test("Increment", s -> {
                    try {
                        return Integer.parseInt(s) + 1 + "";
                    }
                    catch(NumberFormatException e) {
                        return s;
                    }
                }
        );
        test("Replace", s -> s.replace("2", "9"));
        test("Take last digit", s -> s.length() > 0 ?
                s.charAt(s.length() - 1) + "" : s);
        System.out.println("-----------------");

        Arrays.stream(elements).forEach(s -> {
            if(s.length() > 0){
                /**
                 * 12  2
                 * 23  3
                 * 45  5
                 * 字符串的index  从0 开始
                 */
                System.out.println(s.length() - 1);
                System.out.println(s.charAt(s.length() - 1));
            }else{
                System.out.println(s);
            }
        });

    }

}
