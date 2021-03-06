package com.leospiritlee.base.typeinfo;

import java.util.function.Supplier;
import java.util.stream.Stream;

/**
 * @Project: JavaStudyDemo
 * @ClassName DynamicSupplier
 * @description: TODO
 * @author: leospiritlee
 * @create: 2020-03-03 17:05
 **/
public class DynamicSupplier<T> implements Supplier<T> {

    private Class<T> type;
    public DynamicSupplier(Class<T> type) {
        this.type = type;
    }

    @Override
    public T get() {
        try {
            return type.newInstance();
        } catch(InstantiationException |
                IllegalAccessException e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) {
        Stream.generate(
                new DynamicSupplier<>(CountedInteger.class))
                .skip(10)
                .limit(5)
                .forEach(System.out::println);
    }

}


class CountedInteger {
    private static long counter;
    private final long id = counter++;
    @Override
    public String toString() { return Long.toString(id); }
}