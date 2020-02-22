package com.leospiritlee.base.shape;

/**
 * @Project: JavaStudyDemo
 * @ClassName Shapes
 * @description: TODO
 * @author: leospiritlee
 * @create: 2020-02-22 16:58
 **/
public class Shapes {

    public static void main(String[] args) {
        RandomShapes gen = new RandomShapes();
        // Make polymorphic method calls:

        Shape[] shapes = gen.array(9);

        for (Shape shape: shapes) {
            shape.draw();
        }
    }
}
