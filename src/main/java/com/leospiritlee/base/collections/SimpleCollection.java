package com.leospiritlee.base.collections;

import java.util.ArrayList;
import java.util.Collection;

/**
 * @Project: JavaStudyDemo
 * @ClassName SimpleCollection
 * @description: TODO
 * @author: leospiritlee
 * @create: 2020-02-28 18:54
 **/
public class SimpleCollection {

    public static void main(String[] args) {
        Collection<Integer> c = new ArrayList<>();
        for(int i = 0; i < 10; i++)
            c.add(i); // Autoboxing
        for(Integer i : c)
            System.out.print(i + ", ");
    }

}
