package com.leospiritlee.base.generics;

/**
 * @Project: JavaStudyDemo
 * @ClassName GenericMethods
 * @description: TODO
 * @author: leospiritlee
 * @create: 2020-03-29 15:11
 **/
public class GenericMethods {

    public <T> void f(T x) {
        System.out.println(x.getClass().getName());
    }

    public static void main(String[] args) {
        GenericMethods gm = new GenericMethods();
        gm.f("");
        gm.f(1);
        gm.f(1.0);
        gm.f(1.0F);
        gm.f('c');
        gm.f(gm);
    }

}
