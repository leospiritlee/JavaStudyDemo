package com.leospiritlee.base.functional;

import java.util.function.IntSupplier;

/**
 * @Project: JavaStudyDemo
 * @ClassName SharedStorage
 * @description: TODO
 * @author: leospiritlee
 * @create: 2020-03-09 22:17
 **/
public class SharedStorage {

    public static void main(String[] args) {
        Closure1 c1 = new Closure1();

        //X = 0 i = 1
        IntSupplier f1 = c1.makeFun(0);
        //X = 1 i = 2
        IntSupplier f2 = c1.makeFun(0);
        //X = 2 i = 3
        IntSupplier f3 = c1.makeFun(0);
        System.out.println(f1.getAsInt());
        System.out.println(f2.getAsInt());
        System.out.println(f3.getAsInt());

        //X = 4 i = 4
        IntSupplier f1_2 = c1.makeFun2(0);
        //X = 5 i = 5
        IntSupplier f2_2 = c1.makeFun2(0);
        //X = 6 i = 6
        IntSupplier f3_2 = c1.makeFun2(0);
        System.out.println(f1_2.getAsInt());
        System.out.println(f2_2.getAsInt());
        System.out.println(f3_2.getAsInt());

    }

}
