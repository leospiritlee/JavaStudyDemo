package com.leospiritlee.base.shape;

/**
 * @Project: JavaStudyDemo
 * @ClassName Triangle
 * @description: TODO
 * @author: leospiritlee
 * @create: 2020-02-22 16:56
 **/
public class Triangle  extends Shape {
    @Override
    public void draw() {
        System.out.println("Triangle.draw()");
    }
    @Override
    public void erase() {
        System.out.println("Triangle.erase()");
    }
}
