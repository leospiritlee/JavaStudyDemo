package com.leospiritlee.base.generics;

/**
 * @Project: JavaStudyDemo
 * @ClassName ReturnGenericType
 * @description: TODO
 * @author: leospiritlee
 * @create: 2020-03-31 10:42
 **/
public class ReturnGenericType<T extends HasF> {

    private T obj;

    ReturnGenericType(T x) {
        obj = x;
    }

    public T get() {
        return obj;
    }

}
