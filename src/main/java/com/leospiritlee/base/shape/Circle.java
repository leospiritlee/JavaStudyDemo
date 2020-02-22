package com.leospiritlee.base.shape;

/**
 * @Project: JavaStudyDemo
 * @ClassName Circle
 * @description: TODO
 * @author: leospiritlee
 * @create: 2020-02-22 16:54
 **/
public class Circle extends Shape {
    @Override
    public void draw() {
        System.out.println("Circle.draw()");
    }
    @Override
    public void erase() {
        System.out.println("Circle.erase()");
    }
}
