package com.leospiritlee.base.generics;

/**
 * @Project: JavaStudyDemo
 * @ClassName Coffee
 * @description: TODO
 * @author: leospiritlee
 * @create: 2020-03-29 14:51
 **/
public class Coffee {

    private static long counter = 0;
    private final long id = counter++;

    @Override
    public String toString() {
        return getClass().getSimpleName() + " " + id;
    }

}
