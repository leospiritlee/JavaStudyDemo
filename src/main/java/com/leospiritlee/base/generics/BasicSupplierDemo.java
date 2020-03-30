package com.leospiritlee.base.generics;

import com.leospiritlee.base.onjava.BasicSupplier;

import java.util.stream.Stream;

/**
 * @Project: JavaStudyDemo
 * @ClassName BasicSupplierDemo
 * @description: TODO
 * @author: leospiritlee
 * @create: 2020-03-30 21:30
 **/
public class BasicSupplierDemo {

    public static void main(String[] args) {
        Stream.generate(
                BasicSupplier.create(CountedObject.class))
                .limit(10)
                .forEach(System.out::println);
    }

}
