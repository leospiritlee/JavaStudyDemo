package com.leospiritlee.base;

/**
 * @Project: JavaStudyDemo
 * @ClassName StaticPolymorphism
 * @description: TODO
 * @author: leospiritlee
 * @create: 2020-02-22 17:40
 **/
public class StaticPolymorphism {

    public static void main(String[] args) {
        StaticSuper sup = new StaticSub(); // Upcast
        System.out.println(StaticSuper.staticGet());
        System.out.println(sup.dynamicGet());
    }
}
