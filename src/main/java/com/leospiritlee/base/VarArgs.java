package com.leospiritlee.base;

/**
 * @Project: JavaStudyDemo
 * @ClassName VarArgs
 * @description: TODO
 * @author: leospiritlee
 * @create: 2020-02-18 21:26
 **/
public class VarArgs {

    static void printArray(Object[] args) {
        for (Object obj: args) {
            System.out.print(obj + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        printArray(new Object[] {47, (float) 3.14, 11.11});
        printArray(new Object[] {"one", "two", "three"});
        printArray(new Object[] {new A(), new A(), new A()});
    }
}

class A {}
