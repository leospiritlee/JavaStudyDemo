package com.leospiritlee.base;


/**
 * @Project: JavaStudyDemo
 * @ClassName Overloading
 * @description: TODO
 * @author: leospiritlee
 * @create: 2020-02-17 20:21
 **/
public class Overloading {


    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            Tree t = new Tree(i);
            t.info();
            t.info("overloaded method");
        }
        new Tree();
    }
}
