package com.leospiritlee.base.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/**
 * @Project: JavaStudyDemo
 * @ClassName AddingGroups
 * @description: TODO
 * @author: leospiritlee
 * @create: 2020-02-28 18:59
 **/
public class AddingGroups {

    public static void main(String[] args) {
        Collection<Integer> collection =
                new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        Integer[] moreInts = { 6, 7, 8, 9, 10 };
        collection.addAll(Arrays.asList(moreInts));
        // Runs significantly faster, but you can't
        // construct a Collection this way:
        Collections.addAll(collection, 11, 12, 13, 14, 15);
        Collections.addAll(collection, moreInts);
        // Produces a list "backed by" an array:
        List<Integer> list = Arrays.asList(16,17,18,19,20);
        list.set(1, 99); // OK -- modify an element
        // list.add(21); // Runtime error; the underlying
        // array cannot be resized.

        System.out.println(collection);
        System.out.println(list);
    }

}
