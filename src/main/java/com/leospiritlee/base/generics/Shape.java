package com.leospiritlee.base.generics;

/**
 * @Project: JavaStudyDemo
 * @ClassName Shape
 * @description: TODO
 * @author: leospiritlee
 * @create: 2020-04-02 11:09
 **/
public class Shape {

    private static long counter = 0;
    private final long id = counter++;
    @Override
    public String toString() {
        return getClass().getSimpleName() + " " + id;
    }
    public void rotate() {
        System.out.println(this + " rotate");
    }
    public void resize(int newSize) {
        System.out.println(this + " resize " + newSize);
    }

}
