package com.leospiritlee.base.innerclasses;

import java.util.Arrays;

/**
 * @Project: JavaStudyDemo
 * @ClassName Sequence
 * @description: TODO
 * @author: leospiritlee
 * @create: 2020-02-25 20:37
 **/

interface Selector {
    boolean end();
    Object current();
    void next();
}

public class Sequence {

    private Object[] items;
    private int next = 0;

    public Sequence(int size) {
        items = new Object[size];
    }

    public void add(Object x) {
        if(next < items.length){
            items[next++] = x;
        }
    }

    public Object[] getItems(){
        return items;
    }

    private class SequenceSelector implements Selector {
        private int i = 0;
        @Override
        public boolean end() { return i == items.length; }
        @Override
        public Object current() { return items[i]; }
        @Override
        public void next() { if(i < items.length) i++; }
    }

    public Selector selector() {
        return new SequenceSelector();
    }

    public static void main(String[] args) {

        int arrayLength = 10;

        Sequence sequence = new Sequence(arrayLength);

        for(int i = 0; i < arrayLength; i++){
            sequence.add(Integer.toString(i));
        }

        System.out.println(Arrays.toString(sequence.getItems()));

        Selector selector = sequence.selector();

        while(!selector.end()) {
            System.out.print(selector.current() + " ");
            selector.next();
        }
    }

}
