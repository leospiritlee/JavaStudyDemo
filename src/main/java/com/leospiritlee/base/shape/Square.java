package com.leospiritlee.base.shape;

/**
 * @Project: JavaStudyDemo
 * @ClassName Square
 * @description: TODO
 * @author: leospiritlee
 * @create: 2020-02-22 16:55
 **/
public class Square extends Shape {
    @Override
    public void draw() {
        System.out.println("Square.draw()");
    }
    @Override
    public void erase() {
        System.out.println("Square.erase()");
    }
}
