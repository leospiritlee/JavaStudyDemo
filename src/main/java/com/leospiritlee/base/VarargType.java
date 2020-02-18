package com.leospiritlee.base;

/**
 * @Project: JavaStudyDemo
 * @ClassName VarargType
 * @description: TODO
 * @author: leospiritlee
 * @create: 2020-02-18 21:34
 **/
public class VarargType {

    static void f(Character... args) {
        System.out.print(args.getClass());
        System.out.println(" length " + args.length);
    }

    static void g(int... args) {
        System.out.print(args.getClass());
        System.out.println(" length " + args.length);
    }

    public static void main(String[] args) {
        f('a');
        f();
        g(1);
        g();
        System.out.println("int[]: "+ new int[0].getClass());
    }
}
