package com.leospiritlee.base.generics;

import java.util.Iterator;

/**
 * @Project: JavaStudyDemo
 * @ClassName IterableFibonacci
 * @description: TODO
 * @author: leospiritlee
 * @create: 2020-03-29 15:05
 **/
public class IterableFibonacci extends Fibonacci implements Iterable<Integer>  {

    private int n;
    public IterableFibonacci(int count) { n = count; }

    @Override
    public Iterator<Integer> iterator() {
        return new Iterator<Integer>() {
            @Override
            public boolean hasNext() { return n > 0; }
            @Override
            public Integer next() {
                n--;
                return IterableFibonacci.this.get();
            }
            @Override
            public void remove() { // Not implemented
                throw new UnsupportedOperationException();
            }
        };
    }

    public static void main(String[] args) {
        for(int i : new IterableFibonacci(18))
            System.out.print(i + " ");
    }
}
