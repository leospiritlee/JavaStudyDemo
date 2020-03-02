package com.leospiritlee.base.typeinfo;

import java.util.stream.Stream;

/**
 * @Project: JavaStudyDemo
 * @ClassName Shapes
 * @description: TODO
 * @author: leospiritlee
 * @create: 2020-03-02 16:02
 **/
public class Shapes {

    public static void main(String[] args) {
        Stream.of(
                new Circle(), new Square(), new Triangle())
                .forEach(Shape::draw);
    }

}


abstract class Shape {
    void draw() { System.out.println(this + ".draw()"); }
    @Override
    public abstract String toString();
}

class Circle extends Shape {
    @Override
    public String toString() { return "Circle"; }
}

class Square extends Shape {
    @Override
    public String toString() { return "Square"; }
}

class Triangle extends Shape {
    @Override
    public String toString() { return "Triangle"; }
}
