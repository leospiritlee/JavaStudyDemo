package com.leospiritlee.base.functional;

import java.util.function.IntSupplier;

/**
 * @Project: JavaStudyDemo
 * @ClassName Closure1
 * @description: TODO
 * @author: leospiritlee
 * @create: 2020-03-09 22:11
 **/
public class Closure1 {

    int i;
    IntSupplier makeFun(int x) {
        return () -> x + i++;
    }

    IntSupplier makeFun2(int x){
        return () -> x + ++i;
    }

    public static void main(String[] args) {
        Closure1 c = new Closure1();
        System.out.println(c.makeFun(11).getAsInt());
        System.out.println(c.makeFun2(11).getAsInt());
    }
}
