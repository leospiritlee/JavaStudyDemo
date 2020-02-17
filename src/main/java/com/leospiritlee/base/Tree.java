package com.leospiritlee.base;

/**
 * @Project: JavaStudyDemo
 * @ClassName Tree
 * @description: TODO
 * @author: leospiritlee
 * @create: 2020-02-17 20:21
 **/
public class Tree {

    int height;
    Tree() {
        System.out.println("Planting a seedling");
        height = 0;
    }
    Tree(int initialHeight) {
        height = initialHeight;
        System.out.println("Creating new Tree that is " + height + " feet tall");
    }
    void info() {
        System.out.println("Tree is " + height + " feet tall");
    }
    void info(String s) {
        System.out.println(s + ": Tree is " + height + " feet tall");
    }

}
