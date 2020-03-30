package com.leospiritlee.base.generics;

/**
 * @Project: JavaStudyDemo
 * @ClassName CountedObject
 * @description: TODO
 * @author: leospiritlee
 * @create: 2020-03-30 21:24
 **/
public class CountedObject {

    private static long counter = 0;
    private final long id = counter++;

    public long id() {
        return id;
    }

    @Override
    public String toString() {
        return "CountedObject " + id;
    }

}
