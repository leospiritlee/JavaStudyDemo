package com.leospiritlee.base;

/**
 * @Project: JavaStudyDemo
 * @ClassName Leaf
 * @description: TODO
 * @author: leospiritlee
 * @create: 2020-02-17 20:47
 **/
public class Leaf {

    int i = 0;

    Leaf increment() {
        i++;
        return this;
    }

    void print() {
        System.out.println("i = " + i);
    }

    public static void main(String[] args) {
        Leaf x = new Leaf();
        x.increment().increment().increment().print();
    }
}
