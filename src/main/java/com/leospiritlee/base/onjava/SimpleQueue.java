package com.leospiritlee.base.onjava;

import java.util.Iterator;
import java.util.LinkedList;

/**
 * @Project: JavaStudyDemo
 * @ClassName SimpleQueue
 * @description: TODO
 * @author: leospiritlee
 * @create: 2020-04-02 11:10
 **/
public class SimpleQueue<T> implements Iterable<T> {

    private LinkedList<T> storage = new LinkedList<>();

    public void add(T t) {
        storage.offer(t);
    }

    public T get() {
        return storage.poll();
    }

    @Override
    public Iterator<T> iterator() {
        return storage.iterator();
    }
}
