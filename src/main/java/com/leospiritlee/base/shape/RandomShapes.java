package com.leospiritlee.base.shape;

import java.util.Random;

/**
 * @Project: JavaStudyDemo
 * @ClassName RandomShapes
 * @description: TODO
 * @author: leospiritlee
 * @create: 2020-02-22 16:58
 **/
public class RandomShapes {

    private Random rand = new Random(47);

    public Shape get() {
        switch(rand.nextInt(3)) {
            default:
            case 0: return new Circle();
            case 1: return new Square();
            case 2: return new Triangle();
        }
    }

    public Shape[] array(int sz) {
        Shape[] shapes = new Shape[sz];
        // Fill up the array with shapes:
        for (int i = 0; i < shapes.length; i++) {
            shapes[i] = get();
        }
        return shapes;
    }
}
