package com.leospiritlee.base.generics;

import com.leospiritlee.base.onjava.SimpleQueue;
import com.leospiritlee.base.onjava.Suppliers;

import java.util.stream.Stream;

/**
 * @Project: JavaStudyDemo
 * @ClassName ApplyFunctional
 * @description: TODO
 * @author: leospiritlee
 * @create: 2020-04-02 11:27
 **/
public class ApplyFunctional {

    public static void main(String[] args) {
        Stream.of(
                Stream.generate(Shape::new).limit(2),
                Stream.generate(Square::new).limit(2))
                .flatMap(c -> c) // flatten into one stream
                .peek(Shape::rotate)
                .forEach(s -> s.resize(7));

        new FilledList<>(Shape::new, 2)
                .forEach(Shape::rotate);
        new FilledList<>(Square::new, 2)
                .forEach(Shape::rotate);

        SimpleQueue<Shape> shapeQ = Suppliers.fill(
                new SimpleQueue<>(), SimpleQueue::add,
                Shape::new, 2);
        Suppliers.fill(shapeQ, SimpleQueue::add,
                Square::new, 2);
        shapeQ.forEach(Shape::rotate);
    }

}
