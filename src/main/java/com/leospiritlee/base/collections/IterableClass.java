package com.leospiritlee.base.collections;

import java.util.Iterator;

/**
 * @Project: JavaStudyDemo
 * @ClassName IterableClass
 * @description: TODO
 * @author: leospiritlee
 * @create: 2020-03-02 14:29
 **/
public class IterableClass implements Iterable<String> {

    protected String[] words = ("And that is how " +
            "we know the Earth to be banana-shaped."
    ).split(" ");

    @Override
    public Iterator<String> iterator() {
        return new Iterator<String>() {

            private int index = 0;

            @Override
            public boolean hasNext() {
                return index < words.length;
            }

            @Override
            public String next() {
                return words[index++];
            }

            @Override
            public void remove() {
                throw new UnsupportedOperationException();
            }
        };
    }

    public static void main(String[] args) {
        for(String s : new IterableClass())
            System.out.print(s + " ");
    }
}
