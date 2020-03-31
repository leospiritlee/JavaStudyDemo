package com.leospiritlee.base.generics;

import com.leospiritlee.base.onjava.Suppliers;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

/**
 * @Project: JavaStudyDemo
 * @ClassName FilledList
 * @description: TODO
 * @author: leospiritlee
 * @create: 2020-03-31 10:53
 **/
public class FilledList<T> extends ArrayList<T>{

    FilledList(Supplier<T> gen, int size) {
        Suppliers.fill(this, gen, size);
    }



    public FilledList(T t, int size) {
        for (int i = 0; i < size; i++) {
            this.add(t);
        }
    }

    public static void main(String[] args) {
        List<String> list = new FilledList<>("Hello", 4);
        System.out.println(list);
        // Supplier version:
        List<Integer> ilist = new FilledList<>( ()->47, 4);
        System.out.println(ilist);
    }

}
