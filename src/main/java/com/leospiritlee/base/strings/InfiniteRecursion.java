package com.leospiritlee.base.strings;

import java.util.stream.Stream;

/**
 * @Project: JavaStudyDemo
 * @ClassName InfiniteRecursion
 * @description: TODO
 * @author: leospiritlee
 * @create: 2020-03-25 20:18
 **/
public class InfiniteRecursion {

    @Override
    public String toString() {
        return " InfiniteRecursion address: " + this + "\n";
    }
    public static void main(String[] args) {
        Stream.generate(InfiniteRecursion::new)
                .limit(10)
                .forEach(System.out::println);
    }

}
