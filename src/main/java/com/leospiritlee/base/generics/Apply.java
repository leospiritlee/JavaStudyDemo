package com.leospiritlee.base.generics;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @Project: JavaStudyDemo
 * @ClassName Apply
 * @description: TODO
 * @author: leospiritlee
 * @create: 2020-04-02 10:58
 **/
public class Apply {

    public static <T, S extends Iterable<T>> void apply(S seq, Method f, Object... args) {
        try {
            for(T t: seq){
                f.invoke(t, args);
            }

        } catch(IllegalAccessException |
                IllegalArgumentException |
                InvocationTargetException e) {
            // Failures are programmer errors
            throw new RuntimeException(e);
        }
    }

}
