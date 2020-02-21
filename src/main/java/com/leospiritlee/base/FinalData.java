package com.leospiritlee.base;

import java.lang.reflect.Array;
import java.util.*;

/**
 * @Project: JavaStudyDemo
 * @ClassName FinalData
 * @description: TODO
 * @author: leospiritlee
 * @create: 2020-02-21 11:25
 **/

/**
 * output:
 * fd1: i4 = 15, INT_5 = 18
 * Creating new FinalData
 * fd1: i4 = 15, INT_5 = 18
 * fd2: i4 = 13, INT_5 = 18
 *
 *  一个被 static 和 final 同时修饰的属性只会占用一段不能改变的存储空间。
 *
 * 对于基本类型，final 使数值恒定不变，而对于对象引用，final 使引用恒定不变。
 * 一旦引用被初始化指向了某个对象，它就不能改为指向其他对象。
 * 但是，对象本身是可以修改的，Java 没有提供将任意对象设为常量的方法。（
 * 你可以自己编写类达到使对象恒定不变的效果）这一限制同样适用数组，数组也是对象。
 */

public class FinalData {

    private static Random rand = new Random(47);
    private String id;

    public FinalData(String id) {
        this.id = id;
    }
    // Can be compile-time constants:
    private final int valueOne = 9;
    private static final int VALUE_TWO = 99;
    // Typical public constant:
    public static final int VALUE_THREE = 39;
    // Cannot be compile-time constants:
    private final int i4 = rand.nextInt(20);
    //多个对象 共享同一块 不能改变 内存
    static final int INT_5 = rand.nextInt(20);
    private Value v1 = new Value(11);
    private final Value v2 = new Value(22);
    private static final Value VAL_3 = new Value(33);
    // Arrays:
    private final int[] a = {1, 2, 3, 4, 5, 6};

    @Override
    public String toString() {
        return id + ": " + "i4 = " + i4 + ", INT_5 = " + INT_5;
    }

    public static void main(String[] args) {
        FinalData fd1 = new FinalData("fd1");
        //- fd1.valueOne++; // Error: can't change value
        fd1.v2.i++; // Object isn't constant
        fd1.v1 = new Value(9); // OK -- not final
        for (int i = 0; i < fd1.a.length; i++) {
            fd1.a[i]++; // Object isn't constant
        }
        //- fd1.v2 = new Value(0); // Error: Can't
        //- fd1.VAL_3 = new Value(1); // change reference
        //- fd1.a = new int[3];
        System.out.println(fd1);
        System.out.println("Creating new FinalData");
        FinalData fd2 = new FinalData("fd2");
        System.out.println(fd1);
        System.out.println(fd2);

        System.out.println(Arrays.toString(fd1.a));
        System.out.println(Arrays.toString(fd2.a));
    }

}


class Value {
    int i; // package access

    Value(int i) {
        this.i = i;
    }
}