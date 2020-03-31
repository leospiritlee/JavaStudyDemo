package com.leospiritlee.base.generics;

import java.util.ArrayList;

/**
 * @Project: JavaStudyDemo
 * @ClassName ErasedTypeEquivalence
 * @description: TODO
 * @author: leospiritlee
 * @create: 2020-03-31 10:34
 **/
public class ErasedTypeEquivalence {

    public static void main(String[] args) {
        Class c1 = new ArrayList<String>().getClass();
        Class c2 = new ArrayList<Integer>().getClass();
        System.out.println(c1 == c2);
    }

}
