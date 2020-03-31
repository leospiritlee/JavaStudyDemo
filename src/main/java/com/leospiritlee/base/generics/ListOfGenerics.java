package com.leospiritlee.base.generics;

import java.util.ArrayList;
import java.util.List;

/**
 * @Project: JavaStudyDemo
 * @ClassName ListOfGenerics
 * @description: TODO
 * @author: leospiritlee
 * @create: 2020-03-31 11:32
 **/
public class ListOfGenerics<T> {
    private List<T> array = new ArrayList<>();

    public void add(T item) {
        array.add(item);
    }

    public T get(int index) {
        return array.get(index);
    }
}
