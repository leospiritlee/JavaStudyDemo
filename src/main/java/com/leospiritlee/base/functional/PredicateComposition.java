package com.leospiritlee.base.functional;

import java.util.function.Predicate;
import java.util.stream.Stream;

/**
 * @Project: JavaStudyDemo
 * @ClassName PredicateComposition
 * @description: TODO
 * @author: leospiritlee
 * @create: 2020-03-10 09:41
 **/
public class PredicateComposition {

    static Predicate<String>
            p1 = s -> s.contains("bar"),
            p2 = s -> s.length() < 5,
            p3 = s -> s.contains("foo"),
            p4 = p1.negate().and(p2).or(p3);

    public static void main(String[] args) {

        /**
         *  执行
         *      p1.negate() !test(t)  操作 s -> ！s.contains("bar") 不包含 “bar”
         *      and
         *      .and(p2) s 的 长度 < 5
         *
         *      or  s -> s.contains("foo")  包含 “foo”
         *
         *
         */
        Stream.of("bar", "foobar", "foobaz", "fongopuckey")
                .filter(p4)
                .forEach(System.out::println);
    }



}
