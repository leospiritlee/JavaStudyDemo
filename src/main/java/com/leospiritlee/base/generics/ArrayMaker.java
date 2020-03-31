package com.leospiritlee.base.generics;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * @Project: JavaStudyDemo
 * @ClassName ArrayMaker
 * @description: TODO
 * @author: leospiritlee
 * @create: 2020-03-31 10:49
 **/
public class ArrayMaker <T> {
    private Class<T> kind;

    public ArrayMaker(Class<T> kind) {
        this.kind = kind;
    }

    @SuppressWarnings("unchecked")
    T[] create(int size) {
        return (T[]) Array.newInstance(kind, size);
    }

    public static void main(String[] args) {
        ArrayMaker<String> stringMaker = new ArrayMaker<>(String.class);
        String[] stringArray = stringMaker.create(9);
        System.out.println(Arrays.toString(stringArray));
    }
}