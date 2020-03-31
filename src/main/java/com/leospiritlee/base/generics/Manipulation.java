package com.leospiritlee.base.generics;

/**
 * @Project: JavaStudyDemo
 * @ClassName Manipulation
 * @description: TODO
 * @author: leospiritlee
 * @create: 2020-03-31 10:38
 **/
public class Manipulation {

    public static void main(String[] args) {
        HasF hf = new HasF();
        Manipulator<HasF> manipulator = new Manipulator<>(hf);
        manipulator.manipulate();
    }

}
