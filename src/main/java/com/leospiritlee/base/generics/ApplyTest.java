package com.leospiritlee.base.generics;

import com.leospiritlee.base.onjava.SimpleQueue;
import com.leospiritlee.base.onjava.Suppliers;

import java.util.ArrayList;
import java.util.List;

/**
 * @Project: JavaStudyDemo
 * @ClassName ApplyTest
 * @description: TODO
 * @author: leospiritlee
 * @create: 2020-04-02 11:09
 **/
public class ApplyTest {

    public static void main(String[] args) throws Exception {
        List<Shape> shapes = Suppliers.create(ArrayList::new, Shape::new, 3);
        Apply.apply(shapes, Shape.class.getMethod("rotate"));
        Apply.apply(shapes, Shape.class.getMethod("resize", int.class), 7);

        List<Square> squares = Suppliers.create(ArrayList::new, Square::new, 3);
        Apply.apply(squares, Shape.class.getMethod("rotate"));
        Apply.apply(squares, Shape.class.getMethod("resize", int.class), 7);

        Apply.apply(new FilledList<>(Shape::new, 3),
                Shape.class.getMethod("rotate"));
        Apply.apply(new FilledList<>(Square::new, 3),
                Shape.class.getMethod("rotate"));

        SimpleQueue<Shape> shapeQ = Suppliers.fill(new SimpleQueue<>(), SimpleQueue::add, Shape::new, 3);
        Suppliers.fill(shapeQ, SimpleQueue::add, Square::new, 3);
        Apply.apply(shapeQ, Shape.class.getMethod("rotate"));
    }

}
